package jsp.cfl.assignments;

import java.util.*;

public class Assignment10 implements Comparator<Student>
{
	public static void main(String[] args) 
	{
		SortedSet<Student> l = new TreeSet<Student>(new Assignment10());
		l.add(new Student("Naga",10,78.12));
		l.add(new Student("Ankith",30,58.12));
		l.add(new Student("Sachin",40,88.42));
		l.add(new Student("Arun",20,59.12));
		l.add(new Student("Akshy",50,55.12));
		l.add(new Student("Vinya",60,62.12));
		
		Iterator<Student> itr =l.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
	
	@Override
	public int compare(Student s1, Student s2)
	{
		//return ((Integer)s1.getId()).compareTo(s2.getId());
		
		//return s2.getName().compareTo(s1.getName());
		
		return ((Double)s1.getMarks()).compareTo(s2.getMarks());
	}
}
