package com.naga.Spring_Framework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       // System.out.println( "Hello World!" );
       // Car car = new Car();
       //car.drive();
    	//Bike bike = new Bike();
    	//bike.drive();
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
    	
    	/*Vehicle obj = (Vehicle)context.getBean("bike");
    	obj.drive();*/
    	
/*    	Tyre t = (Tyre)context.getBean("tyre");
    	System.out.println(t);*/
    	
    	Car obj = (Car)context.getBean("car");
    	obj.drive();
    }
}
