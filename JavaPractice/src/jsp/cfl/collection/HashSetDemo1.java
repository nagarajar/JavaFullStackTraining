package jsp.cfl.collection;
import java.util.*;
public class HashSetDemo1 {

	public static void main(String[] args) 
	{
		// How to print values from HashSet without using For Loop
		
		Set<Integer> hs = new HashSet<Integer>();
		
		hs.add(10);
		hs.add(15);
		hs.add(5);
		hs.add(1);
		hs.add(35);
		hs.add(80);
		hs.add(40);
		
		Iterator itr= hs.iterator();
		
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}
		
		//print only even numbers
		System.out.println();
		Iterator<Integer> itr1= hs.iterator();
		
		while(itr1.hasNext())
		{
			Integer i = itr1.next();
			if(i%2 == 0)
			{
				System.out.print(i+" ");
			}
			
		}

	}

}
