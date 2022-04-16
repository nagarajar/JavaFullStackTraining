package jsp.cfl.collection;

import java.util.*;

public class ArrayListSort1 implements Comparator<Integer>
{
	//ASC and DSC for Integer
	public static void main(String[] args) 
	{
		List<Integer> l = new ArrayList<Integer>();
		;	
		l.add(10);
		l.add(25);
		l.add(12);
		l.add(100);
		l.add(56);
		l.add(3);
		l.add(6);
		l.add(10);
		System.out.println("Before sort:"+l);
		//Collections.sort(l);
	//	System.out.println("After sort:"+l);
	//	Collections.reverse(l);
	//	System.out.println("reverse sort:"+l);
		
		Collections.sort(l, new ArrayListSort1());
		System.out.println("After sort:"+l);
		

	}
	
	@Override
	public int compare(Integer i1, Integer i2)
	{
		return i1.compareTo(i2);
	}
	             
}
