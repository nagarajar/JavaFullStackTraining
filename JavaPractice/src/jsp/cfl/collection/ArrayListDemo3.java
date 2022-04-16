package jsp.cfl.collection;

import java.util.*;

public class ArrayListDemo3 {

	public static void main(String[] args)
	{
		List l = new ArrayList();
			
		l.add(10);
		l.add(10.55);
		l.add("Hello");
		l.add(100l);
		l.add(true);
		l.add('A');
		l.add(null);
		l.add(10);
		l.add(12);
		l.add("Jsp");
		l.add(123);
		l.add("America");
		l.add("India");
		l.add("China");
		l.add("Japan");
		l.add("Nepaal");
		l.add("Astralia");
		
		
		System.out.println(l);
		System.out.println("**********************************************************************\n");
		
		//Print only integers from the above list
		for(int i=0; i<l.size();i++)
		{
			Object obj = l.get(i);
			
			if(obj instanceof Integer)
			{

				System.out.println(obj);
			}
		}
		System.out.println("**********************************************************************\n");
		//Print only Even integers from the above list
		for(int i=0; i<l.size();i++)
		{
			Object obj = l.get(i);
			
			if(obj instanceof Integer)
			{
				//int a = (int)obj; //Type casting
				Integer Itr = (Integer)obj; //Down casting
				if(Itr%2==0)
				{
					System.out.println(obj);
				}
			}
		}
		System.out.println("**********************************************************************\n");
		//Print only string from the above list
		for(int i=0; i<l.size();i++)
		{
			Object obj = l.get(i);
			
			if(obj instanceof String)
			{
				System.out.println(obj);
			}
		}
		System.out.println("**********************************************************************\n");
		//Print only string starts with "A" or some other words from the above list
		for(int i=0; i<l.size();i++)
		{
			Object obj = l.get(i);
			
			if(obj instanceof String)
			{
				String s = (String)obj; //DownCasting
				if(s.startsWith("A"))
				{
					System.out.println(obj);
				}
			}
		}
		System.out.println("**********************************************************************\n");
		//Print only double from the above list
		for(int i=0; i<l.size();i++)
		{
			Object obj = l.get(i);
			
			if(obj instanceof String)
			{
				System.out.println(obj);
			}
		}
		System.out.println("**********************************************************************\n");
		//Print only long from the above list
		for(int i=0; i<l.size();i++)
		{
			Object obj = l.get(i);
			
			if(obj instanceof Long)
			{
				System.out.println(obj);
			}
		}
		System.out.println("**********************************************************************\n");
		//Print only Character from the above list
		for(int i=0; i<l.size();i++)
		{
			Object obj = l.get(i);
			
			if(obj instanceof Character)
			{
				System.out.println(obj);
			}
		}
		System.out.println("**********************************************************************\n");
		//Print only double from the above list
		for(int i=0; i<l.size();i++)
		{
			Object obj = l.get(i);
			
			if(obj instanceof Double)
			{
				System.out.println(obj);
			}
		}
		
		

	}

}
