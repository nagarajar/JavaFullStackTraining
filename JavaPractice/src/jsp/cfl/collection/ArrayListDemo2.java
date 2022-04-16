package jsp.cfl.collection;

import java.util.*;

public class ArrayListDemo2 {

	public static void main(String[] args) 
	{
		List l = new ArrayList();
		
		List m = new ArrayList();
		
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
		
		l.set(5, "Qsp");
		System.out.println(l);
		l.add(1, "World");
		System.out.println(l);
		l.remove("Qsp");
		System.out.println(l);
		System.out.println(l.indexOf(10));
		System.out.println(l.lastIndexOf(10));
		System.out.println(l.contains(10.55));
		System.out.println(l.contains("Qsp"));
		
		System.out.println(l.size());
		System.out.println(m.size());
		
		m.add('B');
		m.add(420);
		m.add("Me");
		
		System.out.println(l.size());
		System.out.println(m.size());
		System.out.println(m);
		
		l.addAll(m);
		System.out.println(l);
		l.removeAll(m);
		System.out.println(l);
		l.addAll(3, m);
		System.out.println(l);
		l.retainAll(m);
		System.out.println(l);
		

	}

}
