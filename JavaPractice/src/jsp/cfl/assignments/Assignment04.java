package jsp.cfl.assignments;

import java.util.*;

public class Assignment04 
{
	public static void main(String[] args) 
	{
		List l = new LinkedList();
		l.add(new Student("Naga",10,78.12));
		l.add(new Student("Ankith",30,58.12));
		l.add(new Student("Sachin",40,88.42));
		l.add(new Student("Arun",20,59.12));
		l.add(new Student("Akshy",50,55.12));
		l.add(new Student("Vinya",60,62.12));
		
		l.add(new Mobile("Mi","White",750000.98));
		l.add(new Mobile("Oppo","Blue",780000.85));
		l.add(new Mobile("Realme","Red",850000));
		l.add(new Mobile("Samsung","Black",950000));
		l.add(new Mobile("Nokia","Green",650000));
		l.add(new Mobile("Sony","Rose",850000));
		l.add(new Mobile("Infinix","SkyBlue",850000));
		
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
		System.out.println("b. Display even students & Mobile objects");
		System.out.println("------------------------------------");
		
		 itr = l.iterator();
		
		while(itr.hasNext())
		{
			Object obj = itr.next();
			if(obj instanceof Student || obj instanceof Mobile)
			{
				System.out.println(obj);
			}
		}
		
		System.out.println("------------------------------------");
		System.out.println("c. Display all students whose marks > 60");
		System.out.println("------------------------------------");
		
		 itr = l.iterator();
		
		while(itr.hasNext())
		{
			Object obj = itr.next();
			if(obj instanceof Student)
			{
				double d = ((Student) obj).getMarks();
				if( d > 60)
				{
					System.out.println(obj);
				}
				
			}
		}
		
		System.out.println("------------------------------------");
		System.out.println("d. Display all students whose name starts with 'S' and marks > 60");
		System.out.println("------------------------------------");
		
		 itr = l.iterator();
		
		while(itr.hasNext())
		{
			Object obj = itr.next();
			if(obj instanceof Student)
			{
				double d = ((Student) obj).getMarks();
				String s = ((Student) obj).getName();
				if( d > 60 && s.startsWith("S"))
				{
					System.out.println(obj);
				}
				
			}
		}
	}

}
