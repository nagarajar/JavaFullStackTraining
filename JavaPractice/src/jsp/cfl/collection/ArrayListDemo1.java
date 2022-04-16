package jsp.cfl.collection;

import java.io.Serializable;
import java.util.*;

public class ArrayListDemo1 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		List l = new ArrayList();
		System.out.println("Before :"+l.size());	
		l.add(10);
		l.add(10.55);
		l.add("Hello");
		l.add(100l);
		l.add(true);
		l.add('A');
		l.add(null);
		l.add(10);
		System.out.println("After  :"+l.size());
		System.out.println(l);
		
		System.out.println(l instanceof List);
		System.out.println(l instanceof Cloneable);
		System.out.println(l instanceof Serializable);
		System.out.println(l instanceof RandomAccess);
		System.out.println(l instanceof Collection);
		System.out.println(l instanceof Set);

	}

}
