package com.in28minutes.rest.webservices.restfulwebservices.helloworld;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//2. Controller
@RestController
public class HelloWorldController 
{
	//3. GET
	//4. URI - /hello-world
	//1. method - "Hello World"
	                               // GET               URI
    //@RequestMapping(method = RequestMethod.GET, path = "/hello-world")    //1st way
	@GetMapping(path = "/hello-world")                                      //2nd way
	public String helloWorld()												//return type is String here	
	{
		return "Hello World";
	}
	
	//hello-world-bean
	@GetMapping(path = "/hello-world-bean")                                 //return type is object here
	public HelloWorldBean helloWorldBean()
	{
		return new HelloWorldBean("Hello World");
	}
	
	//hello-world/path-variable/in28minutes
	@GetMapping(path = "/hello-world/path-variable/{name}")                       //How to work on path-variable
	public HelloWorldBean helloWorldPathVariablen(@PathVariable String name)
	{
		return new HelloWorldBean(String.format("Hello World, %s", name));
	}
	
	//Internationalization - (i18n) - it is nothing but customizing your services for different people around the world
	@Autowired
	private MessageSource messageSource;
	@GetMapping(path = "/hello-world-internationalized")                                   
	//public String helloWorldInternationalized(@RequestHeader(name="Accept-Language", required = false) Locale locale) --> 1st way
	public String helloWorldInternationalized() // 2nd way after this you need to update SessionLocaleResolver to AcceptHeaderLocaleResolver 
											    // in RestfulWebServicesApplication.java class
	{
		//return messageSource.getMessage("good.orning.message",null, locale);  --> 1st way
		return messageSource.getMessage("good.orning.message",null, LocaleContextHolder.getLocale());    // 2nd way
	}
	
}
