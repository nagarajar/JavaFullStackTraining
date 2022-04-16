package jsp.cfl.collection;

import java.util.*;

public class ArrayListDemo4 {

	public static void main(String[] args) 
	{
		List l = new ArrayList();
		
		l.add(new Student("Naga",10,78.12));
		l.add(new Student("Ankith",30,58.12));
		l.add(new Student("Sachin",40,88.42));
		l.add(new Student("Arun",20,72.12));
		l.add(new Student("Akshy",50,68.12));
		l.add(new Student("Vinya",60,62.12));
		
		l.add(new Employee("Naga",10,7800.12));
		l.add(new Employee("Ankith",30,55800.12));
		l.add(new Employee("Sachin",40,8800.42));
		l.add(new Employee("Arun",20,7200.12));
		l.add(new Employee("Akshy",50,6800.12));
		l.add(new Employee("Sai",60,40800.42));
		
		
		
		System.out.println("Name\t\tID\t\tMarks");
		System.out.println("---------------------------------------------");
		for(int i=0; i<l.size(); i++)
		{
			Object obj = l.get(i);
			if(obj instanceof Student)
			{
				System.out.println(obj);
			}
		}
		// WAP to display students whose marks > 60
		System.out.println("-----------------------------------------------------------------");
		System.out.println("WAP to display students whose marks > 60");
		for(int i=0; i<l.size(); i++)
		{
			Object obj = l.get(i);
			
			if(obj instanceof Student)
			{
				Student s = (Student)obj;
				if(s.getMarks()>60)
				{
					System.out.println(obj);
				}
			}
		}
		// WAP to display students whose name starts with "An"
		System.out.println("-----------------------------------------------------------------");
		System.out.println("WAP to display students whose name starts with 'An'");
		for(int i=0; i<l.size(); i++)
		{
			Object obj = l.get(i);
			
			if(obj instanceof Student)
			{
				Student s = (Student)obj;
				if(s.getName().startsWith("An"))
				{
					System.out.println(obj);
				}
			}
		}
		// WAP to display students whose marks in b/w 60 and 65
		System.out.println("-----------------------------------------------------------------");
		System.out.println("WAP to display students whose marks in b/w 60 and 65");
		for(int i=0; i<l.size(); i++)
		{
			Object obj = l.get(i);
			
			if(obj instanceof Student)
			{
				Student s = (Student)obj;
				if(s.getMarks()>=60 && s.getMarks()<=65)
				{
					System.out.println(obj);
				}
			}
		}
		// WAP to display all the employees whose name starts with 'Sa' an earning > 30K
		System.out.println("-----------------------------------------------------------------");
		System.out.println("WAP to display all the employees whose name starts with 'Sa' an earning > 30K");
		for(int i=0; i<l.size(); i++)
		{
			Object obj = l.get(i);
			
			if(obj instanceof Employee)
			{
				Employee e = (Employee)obj;
				if(e.getName().startsWith("Sa") && e.getSal()>30000)
				{
					System.out.println(obj);
				}
			}
		}
		// WAP to display all the employees whose earning > 30K
		System.out.println("-----------------------------------------------------------------");
		System.out.println("WAP to display all the employees whose earning > 30K");
		for(int i=0; i<l.size(); i++)
		{
			Object obj = l.get(i);
			
			if(obj instanceof Employee)
			{
				Employee e = (Employee)obj;
				if(e.getSal()>30000)
				{
					System.out.println(obj);
				}
			}
		}
		// WAP to display students whose marks is highest
		System.out.println("-----------------------------------------------------------------");
		System.out.println("WAP to display students whose marksis highest");
		ArrayList<Double> arr = new ArrayList<>();
		for(int i=0; i<l.size(); i++)
		{
			//Insert marks into array
			Object obj = l.get(i);
			
			if(obj instanceof Student)
			{
				Student s = (Student)obj;
				arr.add(s.getMarks());
			}
		}
		double max = arr.get(0);
		
		for(int i=1;i<arr.size();i++)
		{
			////finding highest marks from array
			if(arr.get(i) > max)
			{
				max = arr.get(i);
			}
		}
		System.out.println(max);
		for(int i=0; i<l.size(); i++)
		{
			//  printing the students details who got highest marks
			Object obj = l.get(i);
			
			if(obj instanceof Student)
			{
				Student s = (Student)obj;
				if(s.getMarks()== max)
				{
					System.out.println(s);
				}
			}
		}
		// WAP to display employees whose sal is lowest
		System.out.println("-----------------------------------------------------------------");
		System.out.println("WAP to display employees whose sal is lowest");
		ArrayList<Double> arr1 = new ArrayList<>();
		for(int i=0; i<l.size(); i++)
		{
			//Insert sal into array
			Object obj = l.get(i);
			
			if(obj instanceof Employee)
			{
				Employee s = (Employee)obj;
				arr1.add(s.getSal());
			}
		}
		double min = arr1.get(0);
		
		for(int i=1;i<arr1.size();i++)
		{
			//finding lowest sal from array
			if(arr1.get(i) < min)
			{
				min = arr1.get(i);
			}
		}
		System.out.println(min);
		for(int i=0; i<l.size(); i++)
		{
			// printing the employees details who got lowest sal
			Object obj = l.get(i);
			
			if(obj instanceof Employee)
			{
				Employee s = (Employee)obj;
				if(s.getSal() == min)
				{
					System.out.println(s);
				}
			}
		}

	}

}
