package com.naga.Spring_Framework;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle 
{
	
	public void drive()
	{
		System.out.println("Riding Bike...!");
	}

}
