package jsp.cfl.collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetAssessment3 {

	public static void main(String[] args) 
	{
		// WAP to print all number palindrome in HS
		Set<Integer> hs = new HashSet<Integer>();
		
		hs.add(101);
		hs.add(152);
		hs.add(545);
		hs.add(111);
		hs.add(351);
		hs.add(808);
		hs.add(405);
		
		Iterator<Integer> itr= hs.iterator();
		
		while(itr.hasNext())
		{
			Integer a = itr.next();
			Integer i = a;
			int rev = 0;
			int rem;
			 while(i > 0)
			 {
				 rem = i%10;
				 rev= rem + rev*10;
				 i = i/10;
			 }
			 
			 if(a == rev)
			 {
				 System.out.println(a);
			 }
			
	
			
		}
		
	
	}

}
