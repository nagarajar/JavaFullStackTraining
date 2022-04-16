package jsp.cfl.collection;

import java.util.*;

public class TreeSetDemo2 implements Comparator<Integer>
{
	public static void main(String[] args) 
	{
		// By this constructor will sort as ASC/DSC we can call this as Customized sorting
			SortedSet<Integer> s = new TreeSet<Integer>(new TreeSetDemo2());
			
			s.add(10);
			s.add(15);
			s.add(5);
			s.add(1);
			s.add(35);
			s.add(80);
			s.add(40);
			s.add(15);
			s.add(5);
				
			System.out.println(s);	
			
	}
	@Override
	public int compare(Integer i1, Integer i2)
	{
		return i2.compareTo(i1);
	}

}
