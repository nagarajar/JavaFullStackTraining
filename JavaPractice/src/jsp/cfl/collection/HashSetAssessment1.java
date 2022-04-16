package jsp.cfl.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetAssessment1 {

	public static void main(String[] args) 
	{
		// WAP to count number of prime numbers in hash set
		Set<Integer> hs = new HashSet<Integer>();
		
		hs.add(10);
		hs.add(17);
		hs.add(5);
		hs.add(1);
		hs.add(37);
		hs.add(80);
		hs.add(40);
		
		Iterator<Integer> itr= hs.iterator();
		
		int count1 = 0;
		while(itr.hasNext())
		{
			int count2 = 0;
			Integer i = itr.next();
			
			for(int j = 1; j< i/2; j++)
			{
				if(i%j == 0)
				{
					count2++;
					
				}
			}	
			if(count2 == 1)
			{
				count1++;
				System.out.println(i);
			}
	}
		System.out.println("No.of prime numbers are "+count1);

	}

}
