package com.naga.spring_annotation;

import org.springframework.stereotype.Component;

@Component
public class Snapdragon implements MobileProcessor {

	public void process() {
		System.out.println("World best CPU");

	}

}
