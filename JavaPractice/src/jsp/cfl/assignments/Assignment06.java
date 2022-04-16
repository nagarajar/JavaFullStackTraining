package jsp.cfl.assignments;

import java.util.*;

public class Assignment06
{
	public static void main(String[] args) 
	{
		Set l = new LinkedHashSet();
		l.add(new Student("Naga",10,78.12));
		l.add(new Student("Ankith",30,58.12));
		l.add(new Student("Sachin",40,88.42));
		l.add(new Student("Arun",20,59.12));
		l.add(new Student("Akshy",50,55.12));
		l.add(new Student("Vinya",60,62.12));
		l.add(new Student("Sachina",40,55.25));
		
		l.add(new Mobile("Mi","White",15000.98));
		l.add(new Mobile("Oppo","Blue",16800.85));
		l.add(new Mobile("Realme","Red",18500));
		l.add(new Mobile("Samsung","Black",26500));
		l.add(new Mobile("Nokia","Green",65000));
		l.add(new Mobile("Sony","Rose",85000));
		l.add(new Mobile("Infinix","SkyBlue",24000));
		
		System.out.println("------------------------------------");
		System.out.println("a. Display only students objects");
		System.out.println("------------------------------------");
		
		Iterator itr = l.iterator();
		
		while(itr.hasNext())
		{
			Object obj = itr.next();
			if(obj instanceof Student)
			{
				System.out.println(obj);
			}
		}
		
		System.out.println("------------------------------------");
		System.out.println("b. Remove all the students having < 60 marks");
		System.out.println("------------------------------------");
		
		 itr = l.iterator();
		
		while(itr.hasNext())
		{
			Object obj = itr.next();
			if(obj instanceof Student)
			{
				double d = ((Student) obj).getMarks();
				if( d < 60)
				{
					itr.remove();
					System.out.println(obj);
				}
				
			}
		}

		
		System.out.println("------------------------------------");
		System.out.println("c.Remove all students whose name starts with 'S' and ends with 'a' and marks < 60");
		System.out.println("------------------------------------");
		
		 itr = l.iterator();
		
		while(itr.hasNext())
		{
			Object obj = itr.next();
			if(obj instanceof Student)
			{
				double d = ((Student) obj).getMarks();
				String s = ((Student) obj).getName();
				if( d < 60 && s.startsWith("S") && s.endsWith("a"))
				{
					itr.remove();
					System.out.println(obj);
				}
				
			}
		}
		
		
		System.out.println("------------------------------------");
		System.out.println("d. Display all mobile price in between 15000 and 25000");
		System.out.println("------------------------------------");
		
		 itr = l.iterator();
		
		while(itr.hasNext())
		{
			Object obj = itr.next();
			if(obj instanceof Mobile)
			{
				double d = ((Mobile) obj).getPrice();
				if( d >= 15000 && d <= 25000)
				{
					System.out.println(obj);
				}
				
			}
		}
		
		System.out.println("------------------------------------");
		System.out.println("a. Display only students objects");
		System.out.println("------------------------------------");
		
		itr = l.iterator();
		
		while(itr.hasNext())
		{
			Object obj = itr.next();
			if(obj instanceof Student)
			{
				System.out.println(obj);
			}
		}
	}

}
