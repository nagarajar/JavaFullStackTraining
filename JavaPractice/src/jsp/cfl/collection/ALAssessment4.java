package jsp.cfl.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ALAssessment4 
{

	public static void main(String[] args) 
	{
		List<Employee> l = new ArrayList<Employee>();
		
		l.add(new Employee("Nagaraja",2001,750000.98));
		l.add(new Employee("Ankith",2021,780000.85));
		l.add(new Employee("Arun",2017,850000));
		l.add(new Employee("Akshya",2018,950000));
		l.add(new Employee("Vinya",2015,650000));
		l.add(new Employee("Vinya",2015,650000));
		l.add(new Employee("Kiran",2011,650000));
		l.add(new Employee("Hemanth",2012,650000));
		
		System.out.println("Color\t\tYear\t\tPrice");
		System.out.println("--------------------------------------------------");
		
		Collections.sort(l, new Employee());
		
		for(int i = 0; i<l.size(); i++)
		{
			System.out.println(l.get(i));
		}
	}

	

}
