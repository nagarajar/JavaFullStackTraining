package jsp.cfl.assignments;

import java.util.*;

public class Assignment09 implements Comparator<Double>
{
	public static void main(String[] args) 
	{
		Set<Double> ts = new TreeSet<Double>(new Assignment09());
		ts.add(20.21);
		ts.add(10.32);
		ts.add(30.51);
		ts.add(15.89);
		ts.add(35.25);
		ts.add(25.11);
		
		System.out.println(ts);
		
		/*List<Double> l = new ArrayList<Double>(ts); // 1st method
		
		Collections.reverse(l);
		
		System.out.println(l);
		*/
		
	}
	@Override
	public int compare(Double i1, Double i2) // 2nd method
	{
		return i2.compareTo(i1);
	}

}
