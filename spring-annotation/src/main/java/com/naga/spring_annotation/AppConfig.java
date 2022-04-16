package com.naga.spring_annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//2nd way
@Configuration
@ComponentScan(basePackages="com.naga.spring_annotation")
public class AppConfig 
{
	//1st way to provide new object
/*	@Bean
	public Samsung getPhone()
	{
		return new Samsung();
	}
	
	@Bean
	public MobileProcessor getProcessor()
	{
		return new Snapdragon();
	}
*/
}
