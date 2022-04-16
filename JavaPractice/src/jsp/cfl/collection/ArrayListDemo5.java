package jsp.cfl.collection;

import java.util.*;

public class ArrayListDemo5 {

	public static void main(String[] args) 
	{
		// ArrayList of objects
		ArrayList arr = new ArrayList();
		arr.add(new Car("Red",2020,1500020));
		arr.add(new Car("White",2019,1000020));
		arr.add(new Car("Red",2017,1800020));
		arr.add(new Car("Blue",2015,5800020));
		arr.add(new Car("White",2020,1600020));
		arr.add(new Car("Blue",2021,1000020));
		arr.add(new Car("Yellow",2022,1100020));
		
		
		System.out.println("Color\t\tYear\t\tPrice");
		System.out.println("---------------------------------------------");
		for(int i = 0; i< arr.size();i++)
		{
			System.out.println(arr.get(i));
		}
		
		System.out.println("---------------------------------------------");
		//WAP display all the car's whose price > 15,00,000.00
		System.out.println("WAP display all the car's whose price > 15,00,000.00");
		System.out.println("---------------------------------------------");
		
		for(int i = 0; i< arr.size();i++)
		{
			Object obj = arr.get(i);
			Car c = (Car)obj;
			if(c.getPrice()>1500000)
			{
				System.out.println(c);
			}
			
			
		}
		System.out.println("---------------------------------------------");
		//WAP display all the car's manufactured in year 2020
		System.out.println("WAP display all the car's manufactured in year 2020");
		System.out.println("---------------------------------------------");
		
		for(int i = 0; i< arr.size();i++)
		{
			Object obj = arr.get(i);
			Car c = (Car)obj;
			if(c.getYear() == 2020)
			{
				System.out.println(c);
			}
			
			
		}
		System.out.println("---------------------------------------------");
		//WAP display all the car's whose color is red and white
		System.out.println("WAP display all the car's whose calor is red and white");
		System.out.println("---------------------------------------------");
		
		for(int i = 0; i< arr.size();i++)
		{
			Object obj = arr.get(i);
			Car c = (Car)obj;
			if(c.getColor().equalsIgnoreCase("red") || c.getColor().equalsIgnoreCase("white"))
			{
				System.out.println(c);
			}
			
			
		}
		System.out.println("---------------------------------------------");
		//WAP display all the car's whose color is blue and price > 10,00,000.00
		System.out.println("WAP display all the car's whose color is blue and price > 10,00,000.00");
		System.out.println("---------------------------------------------");
		
		for(int i = 0; i< arr.size();i++)
		{
			Object obj = arr.get(i);
			Car c = (Car)obj;
			if(c.getColor().equalsIgnoreCase("blue") && c.getPrice()>1000000)
			{
				System.out.println(c);
			}
			
		}
		System.out.println("---------------------------------------------");
		//WAP display highest price car
		System.out.println("WAP display highest price car");
		System.out.println("---------------------------------------------");
		ArrayList<Double> priceArr = new ArrayList<Double>();
		
		for(int i = 0; i< arr.size();i++)
		{
			Object obj = arr.get(i);
			Car c = (Car)obj;
			priceArr.add(c.getPrice());
		}
				
		double max = priceArr.get(0);
		for(int i = 1; i< priceArr.size();i++)
		{
			if(priceArr.get(i) > max)
			{
				max = priceArr.get(i);
			}
		}
		for(int i = 0; i< arr.size();i++)
		{
			Object obj = arr.get(i);
			Car c = (Car)obj;
			if(c.getPrice() == max)
			{
				System.out.println(c);
			}
			
			
		}
		
		System.out.println("---------------------------------------------");
		//WAP display highest price of red car
		System.out.println("WAP display highest price of red car");
		System.out.println("---------------------------------------------");
		ArrayList<Double> priceArr1 = new ArrayList<Double>();
		
		for(int i = 0; i< arr.size();i++)
		{
			Object obj = arr.get(i);
			Car c = (Car)obj;
			if(c.getColor().equalsIgnoreCase("red"))
			{
				priceArr1.add(c.getPrice());
			}
				
		}
		double max1 = priceArr1.get(0);
	
		for(int i = 1; i< priceArr1.size();i++)
		{
			if(priceArr1.get(i) > max1)
			{
				max1 = priceArr1.get(i);
			}
		}
		for(int i = 0; i< arr.size();i++)
		{
			Object obj = arr.get(i);
			Car c = (Car)obj;
			if(c.getPrice() == max1)
			{
				System.out.println(c);
			}
			
			
		}
		
		

	}

}
