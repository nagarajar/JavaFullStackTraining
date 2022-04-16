package jsp.cfl.collection;

import java.util.ArrayList;
import java.util.List;

public class Assessment1 {

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
		l.add(100.22);
		l.add(2.33);
		l.add("Qsp");
		l.add("Jsp");
		l.add("Spider");
		l.add(11);
		l.add(12);
		l.add(17);
		l.add(24);
		l.add(99);
		l.add(1);
		l.add(5);
		l.add(3);
		l.add(29);
		l.add(30);
		l.add(41);
		l.add(97);
		l.add("Naga");
		l.add("Raja");
		l.add("India");
		l.add("Car");
		l.add("bus");
		l.add("Nagara");
		l.add("Gora");
		l.add("Bhara");
	
		System.out.println(l);
		// WAP to display only double numbers
		System.out.println("-----------------------------------------------------------------");
		System.out.println("WAP to display only double numbers");
		for(int i=0; i<l.size(); i++)
		{
			Object obj = l.get(i);
			
			if(obj instanceof Double)
			{
				System.out.println(obj);
			}
		}
		// WAP to display both integer and string
		System.out.println("-----------------------------------------------------------------");
		System.out.println("WAP to display integer and string");
		for(int i=0; i<l.size(); i++)
		{
			Object obj = l.get(i);
			
			if(obj instanceof Integer || obj instanceof String)
			{
				System.out.println(obj);
			}
		}
		// WAP to count both even and odd int numbers
		System.out.println("-----------------------------------------------------------------");
		System.out.println("WAP to display integer and string");
		int countE = 0;
		int countO = 0;
		for(int i=0; i<l.size(); i++)
		{
			Object obj = l.get(i);

			
			if(obj instanceof Integer)
			{
				Integer Itr = (Integer)obj;
				if(Itr%2==0)
				{
					System.out.println(Itr);
					countE++;
				}
				else
				{
					System.out.println(Itr);
					countO++;
				}
				
			}
		}
		System.out.println("Even numbers count: "+countE);
		System.out.println("Odd numbers count: "+countO);
		
		// WAP to count number of prime numbers
		System.out.println("-----------------------------------------------------------------");
		System.out.println("WAP to count number of prime numbers");
		int countP = 0;
		for(int i=0; i<l.size(); i++)
		{
			Object obj = l.get(i);
			
			if(obj instanceof Integer)
			{
				int countR = 0;
				Integer Itr = (Integer)obj;
				for(int j=1; j<Itr/2;j++)
				{
					if(Itr%j==0)
					{
						countR++;
					}
				}
				if(countR == 1)
				{
					System.out.println(Itr);
					countP++;
				}
			}
				
		}
		System.out.println("Prime numbers count: "+countP);
		
		// WAP to display string which contains "a" in it
		System.out.println("-----------------------------------------------------------------");
		System.out.println("WAP to display  string which contains 'a' in it");
		for(int i=0; i<l.size(); i++)
		{
			Object obj = l.get(i);
			
			if(obj instanceof String)
			{
				String s = (String)obj;
				if(s.contains("a"))
				{
					System.out.println(s);
				}
			}
		}
		
		// WAP to display string which ends with "ra" in it
		System.out.println("-----------------------------------------------------------------");
		System.out.println("WAP to display  string which ends with 'ra' in it");
		for(int i=0; i<l.size(); i++)
		{
			Object obj = l.get(i);
			
			if(obj instanceof String)
			{
				String s = (String)obj;
				if(s.endsWith("ra"))
				{
					System.out.println(s);
				}
			}
		}
		
		// WAP to remove all objects except integer and string
		System.out.println("-----------------------------------------------------------------");
		System.out.println(l);
		System.out.println("WAP to  remove all objects except integer and string");
		for(int i=0; i<l.size(); i++)
		{
			Object obj = l.get(i);
			
			
			if(!(obj instanceof Integer) && !(obj instanceof String))
			{
				l.remove(i);
				i--;
			}
		
		}
		System.out.println(l);
		
		// WAP to replace all odd integer by even imteger
		System.out.println("-----------------------------------------------------------------");
		System.out.println(l);
		System.out.println("WAP to replace all odd integer by even imteger");
		for(int i=0; i<l.size(); i++)
		{
			Object obj = l.get(i);
			
			if(obj instanceof Integer)
			{
				Integer Itr = (Integer)obj;
				if(Itr%2 != 0)
				{
					l.set(i, Itr+1);
				}
			}
		
		}
		System.out.println(l);
	}
	

}
