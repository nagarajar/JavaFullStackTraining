package jsp.cfl.collection;

import java.util.*;

public class GenericArrayList1 
{
	public static void main(String[] args)
	{
		List<Integer> l1 = addObject();
		dispIntegerObj(l1);
		List<String> s1 = addStringObj();
		dispStringObj(s1);
	}
	public static List<Integer> addObject()
	{
		List<Integer> l = new ArrayList<Integer>();
		l.add(12);
		l.add(18);
		l.add(19);
		l.add(52);
		l.add(92);
		l.add(33);
		l.add(11);
		l.add(12);
		
		return l;
		
	}
	public static void dispIntegerObj(List<Integer> l)
	{
		for(int i = 0; i<l.size(); i++)
		{
			int itr = l.get(i);
			if(itr%2 == 0)
			{
				System.out.println(itr);
			}
		}
	}
	public static List<String> addStringObj()
	{
		List<String> s = new ArrayList<String>();
		s.add("JSP");
		s.add("SAP");
		s.add("Hello");
		s.add("World");
		s.add("January");
		s.add("ABP");
		s.add("PSSP");
		return s;
		
	}
	public static void dispStringObj(List<String> l)
	{
		for(int i = 0; i<l.size(); i++)
		{
			if(l.get(i).startsWith("SA"))
			{
				System.out.println(l.get(i));
			}
			
		}
	}
}
