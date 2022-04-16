package jsp.cfl.collection;

import java.util.*;

public class ReverseArrayUsingCollection {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		List l = new ArrayList();
		
		l.add(10);
		l.add(10.55);
		l.add("Hello");
		l.add(100l);
		l.add(true);
		l.add('A');
		l.add(null);
		l.add(10);
		System.out.println("Before reversing :"+l);	
		
		for(int i =0; i< l.size()/2; i++)
		{
			Object obj = l.get(i);
			l.set(i, l.get(l.size()-1-i));
			l.set(l.size()-1-i, obj);
		}
		
		
		System.out.println("After reversing :"+l);	

	}

}
