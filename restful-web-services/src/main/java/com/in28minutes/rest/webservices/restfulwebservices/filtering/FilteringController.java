package com.in28minutes.rest.webservices.restfulwebservices.filtering;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;

@RestController
public class FilteringController 
{
	//Static filtering
/*	@GetMapping("/filtering")
	public SomeBean retrieveSomeBean() {
		return new SomeBean("value1","value2","value3");
	}
	
	@GetMapping("/filtering-list")
	public List<SomeBean> retrieveListOfSomeBeans() {
		return Arrays.asList(new SomeBean("value1","value2","value3"),
				new SomeBean("value1","value2","value3"));
	}*/
	
	//Dynamic filtering
	
	//field1, field2
	@GetMapping("/filtering")
	public MappingJacksonValue retrieveSomeBean() {
		 
		SomeBean someBean =	new SomeBean("value1","value2","value3");  //1
		
		SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("field1", "field2");//5  	
		FilterProvider filters = new SimpleFilterProvider().addFilter("SomeBeanFilter", filter);//4
		
		MappingJacksonValue mapping = new MappingJacksonValue(someBean);//2
		mapping.setFilters(filters);//3
		
		return mapping;
		
	}
	
	//filed2, field3
	@GetMapping("/filtering-list")
	public MappingJacksonValue retrieveListOfSomeBeans() {
		List<SomeBean> list = Arrays.asList(new SomeBean("value1","value2","value3"),
				new SomeBean("value1","value2","value3"));
		
		SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("field2", "field3");//5  	
		FilterProvider filters = new SimpleFilterProvider().addFilter("SomeBeanFilter", filter);//4
		
		MappingJacksonValue mapping = new MappingJacksonValue(list);//2
		mapping.setFilters(filters);//3
		
		return mapping;
		
	}
}
