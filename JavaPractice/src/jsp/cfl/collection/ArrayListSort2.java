package jsp.cfl.collection;

import java.util.*;

public class ArrayListSort2 implements Comparator<Double>
{

	public static void main(String[] args) 
	{
		//ASC and DSC for Double
		List<Double> l = new ArrayList<Double>();
			;	
			l.add(10.11);
			l.add(25.33);
			l.add(12.63);
			l.add(100.69);
			l.add(56.25);
			l.add(3.96);
			l.add(6.85);
			l.add(10.75);
			System.out.println("Before sort:"+l);
			//Collections.sort(l);
		//	System.out.println("After sort:"+l);
		//	Collections.reverse(l);
		//	System.out.println("reverse sort:"+l);
			
			Collections.sort(l, new ArrayListSort2());
			System.out.println("After sort:"+l);
			

		}
		
		@Override
		public int compare(Double i1, Double i2)
		{
			return i1.compareTo(i2);
		}
		        

	

}
