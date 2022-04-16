package jsp.cfl.collection;
import java.util.*;
public class Car implements Comparator<Car>
{
	private String color;
	private int year;
	private double price;
	
	public Car()
	{
	}
	
	public Car(String color,int year,double price)
	{
		this.color = color;
		this.year = year;
		this.price = price;
	}
	
	public String getColor()
	{
		return color;
	}
	public void setColor(String color)
	{
		this.color = color;
	}

	public int getYear() 
	{
		return year;
	}

	public void setYear(int year) 
	{
		this.year = year;
	}

	public double getPrice() 
	{
		return price;
	}

	public void setPrice(double price) 
	{
		this.price = price;
	}
	
	public String toString()
	{
		return color+"\t\t"+year+"\t\t"+price;
	}
	
	@Override
	public int compare(Car c1, Car c2)
	{
		return ((Double)c2.price).compareTo(c1.price);
	}

}
