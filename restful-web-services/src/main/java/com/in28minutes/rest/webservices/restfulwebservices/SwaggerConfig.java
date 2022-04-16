package com.in28minutes.rest.webservices.restfulwebservices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

//2.Configuration
//3.Enable swagger
@Configuration
@EnableSwagger2
public class SwaggerConfig 
{
	//4.2 configuring the contact detail  
	public static final Contact DEFAULT_CONTACT = new Contact("Nagaraja R","http://www.in28minutes.com","Nagu@gmail.com");  
	//4.1 configuring DEFAULT_API_INFO  
	public static final ApiInfo DEFAULT_API_INFO = new ApiInfo("RESTful API Demo", "Api Documentation Description", "1.0", "urn:tos",  
	DEFAULT_CONTACT, "Apache 2.0", "http://www.apache.org/licenses/LICENSE-2.0", new ArrayList<VendorExtension>());  
	
	//5.1 two format which we want to produce and consume  
	private static final Set<String> DEFAULT_PRODUCES_AND_CONSUMES = new HashSet<String>(Arrays.asList("application/json","appication/xml")); 
	//1.creating bean  
	@Bean  
	public Docket api()  
	{  
	ApiInfo apiInfo;  
	return new Docket(DocumentationType.SWAGGER_2)		//1
			.apiInfo(DEFAULT_API_INFO)					//4
			.produces(DEFAULT_PRODUCES_AND_CONSUMES)	//5
			.consumes(DEFAULT_PRODUCES_AND_CONSUMES);  	//6
	}  
	
}
