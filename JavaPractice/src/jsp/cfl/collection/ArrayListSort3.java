package jsp.cfl.collection;

import java.util.*;

public class ArrayListSort3 implements Comparator<String>
{
	public static void main(String[] args) 
	{
		//ASC and DSC for Double
		List<String> l = new ArrayList<String>();
			;	
			l.add("Hello");
			l.add("World");
			l.add("Good");
			l.add("Morning");
			l.add("How");
			l.add("Lion");
			l.add("Dog");
			l.add("Elephant");
			System.out.println("Before sort:"+l);
			//Collections.sort(l);
		//	System.out.println("After sort:"+l);
		//	Collections.reverse(l); // Short cut for Descending order
		//	System.out.println("reverse sort:"+l);
			
			Collections.sort(l, new ArrayListSort3());
			System.out.println("After sort:"+l);
			

		}
		
		@Override
		public int compare(String i1, String i2)
		{
			return i1.compareTo(i2);
		}
		    
}
