package jsp.cfl.assignments;
import java.util.*;
public class Assignment07 implements Comparator<Integer>
{
	public static void main(String[] args) 
	{
		Set<Integer> ts = new TreeSet<Integer>(new Assignment07());
		ts.add(20);
		ts.add(10);
		ts.add(30);
		ts.add(15);
		ts.add(35);
		ts.add(25);
		
		System.out.println(ts);
		
		/*List<Integer> l = new ArrayList<Integer>(ts); // 1st method
		
		Collections.reverse(l);
		
		System.out.println(l);
		*/
		
	}
	@Override
	public int compare(Integer i1, Integer i2) // 2nd method
	{
		return i2.compareTo(i1);
	}

}
