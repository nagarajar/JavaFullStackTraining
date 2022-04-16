package jsp.cfl.collection;

import library.management.system.*;
import java.util.*;

public class ALAssessment1 
{

	public static void main(String[] args) 
	{
		List<Book> l = new ArrayList<Book>();
		
		l.add(new Book(10,"Hindi","Nagaraja"));
		l.add(new Book(30,"English","Raja"));
		l.add(new Book(40,"Kannada","Ankith"));
		l.add(new Book(20,"Social","Arun"));
		l.add(new Book(50,"Science","Akshay"));
		
		System.out.println("ID\t\tName\t\tAuthor");
		System.out.println("--------------------------------------------------");
		
		Collections.sort(l, new Book());
		
		for(int i = 0; i<l.size(); i++)
		{
			System.out.println(l.get(i));
		}
		
	

	}

}
