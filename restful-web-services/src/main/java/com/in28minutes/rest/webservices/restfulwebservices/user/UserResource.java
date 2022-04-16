package com.in28minutes.rest.webservices.restfulwebservices.user;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class UserResource 
{
	@Autowired
	private UserDaoService service;
	//GET /users
	//retrieveAllUsers
	@GetMapping("/users")
	public List<User> retrieveAllUsers(){
		return service.findAll();
	}
	
	//GET /users/{id}
	//retrieve a specific user
	@GetMapping("/users/{id}")
	public EntityModel<User> retrieveUser(@PathVariable int id)
	{
		//What can we do if user not found in the user list
		//We can through userNotFoundException
		
		User user = service.findOne(id);
		if(user == null) {
			throw new userNotFoundException("id - "+id);
		}
	
		//HATEOAS  - Hypermedia As The Engine Of Application State
		//It will include the link to get all-users with the return details of the specific user  
		
		// "all-users" , SERVER_PATH + "/users"
		// retrieveAllUsers
		
		EntityModel<User> resource = EntityModel.of(user);
		
		WebMvcLinkBuilder linkTo = 
				linkTo(methodOn(this.getClass()).retrieveAllUsers());
		
		resource.add(linkTo.withRel("all-users"));
		
		
		return resource;
		
				
	}
	
	//DELETE /users/{id}
	//delete a specific user 
	@DeleteMapping("/users/{id}")
	public void deleteUser(@PathVariable int id)
	{
		//What can we do if user not found in the user list
		//We can through userNotFoundException
		
		User user = service.deleteById(id);
		if(user == null) {
			throw new userNotFoundException("id - "+id);
		}
					
	}
	
	//Create user or add new user into the list and include validation
	//input - details of user
	//output - CREATED & Return the created URI
	@PostMapping("/users")
	public ResponseEntity<Object> createUser(@Valid @RequestBody User user)
	{
		User savedUser = service.save(user);
		
		//How can we show status is CREATED if the user is saved
		// /user/{id}  --> the will pickup from savedUser.getId()
		
		URI location = ServletUriComponentsBuilder
							.fromCurrentRequest()
							.path("/{id}")
							.buildAndExpand(savedUser.getId())
							.toUri();
		return ResponseEntity.created(location).build();
	}
}
