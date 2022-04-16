package com.naga.Spring_Framework;

import org.springframework.stereotype.Component;

@Component
public class Tyre 
{
	
	private String brand;
	
	//If bean is using constructor - we can say constructor Injection
/*	public Tyre(String brand) {
		super();
		this.brand = brand;
	}
*/
	public String getBrand() {
		return brand;
	}
	
	//If bean is using setter - we can say Setter Injection
	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "It's working ....";
	}

}
