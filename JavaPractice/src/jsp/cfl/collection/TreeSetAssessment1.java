package jsp.cfl.collection;
import java.util.*;
public class TreeSetAssessment1 implements Comparator<Car> 
{

	public static void main(String[] args) 
	{
		//WAP to sort all cars based on the price if the price is same then sort based YOM
		SortedSet<Car> s = new TreeSet<Car>(new TreeSetAssessment1());
		
		s.add(new Car("Red",2020,1500020));
		s.add(new Car("White",2019,1000020));
		s.add(new Car("Red",2017,1800020));
		s.add(new Car("Blue",2015,5800020));
		s.add(new Car("White",2020,1600020));
		s.add(new Car("Blue",2021,1000020));
		s.add(new Car("Yellow",2022,1100020));
		
		
		System.out.println("Color\t\tYear\t\tPrice");
		System.out.println("---------------------------------------------");
		Iterator itr = s.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}
	
	@Override
	public int compare(Car c1, Car c2)
	{
		if(c1.getPrice() == c2.getPrice())
		{
			return ((Integer)c1.getYear()).compareTo(c2.getYear());
		}
		else
		{
			return ((Double)c1.getPrice()).compareTo(c2.getPrice());
		}
		
	}

}
