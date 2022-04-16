package jsp.cfl.assignments;

import java.util.*;

public class Assignment08 implements Comparator<String>
{
	public static void main(String[] args) 
	{
		Set<String> ts = new TreeSet<String>(new Assignment08());
		ts.add("Sachin");
		ts.add("Vikash");
		ts.add("Nagaraja");
		ts.add("Hari");
		ts.add("Mari");
		ts.add("Ankith");
		
		System.out.println(ts);
		
		/*List<String> l = new ArrayList<String>(ts); // 1st method
		
		Collections.reverse(l);
		
		System.out.println(l);
		*/
		
	}
	@Override
	public int compare(String i1, String i2) // 2nd method
	{
		return i2.compareTo(i1);
	}

}
