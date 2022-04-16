package jsp.cfl.collection;

import java.util.*;

public class ArrayListSort4 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		List<Student> l = new ArrayList<Student>();
		
		l.add(new Student("Naga",10,78.12));
		l.add(new Student("Ankith",30,58.12));
		l.add(new Student("Sachin",40,88.42));
		l.add(new Student("Arun",20,72.12));
		l.add(new Student("Akshy",50,68.12));
		l.add(new Student("Vinya",60,62.12));
		
		Collections.sort(l, new Student());
		
		System.out.println("Name\t\tID\t\tMarks");
		System.out.println("---------------------------------------------");
		for(int i=0; i<l.size(); i++)
		{
			
			System.out.println(l.get(i));
			
		}

	}

}
