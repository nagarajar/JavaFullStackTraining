package jsp.cfl.collection;
import java.util.*;
public class HashSetAssessment2 {

	public static void main(String[] args) 
	{
		// WAP to disp all strings start with "S"
		Set<String> s = new HashSet<String>();
		
		s.add("Nagaraja");
		s.add("Raja");
		s.add("Tarun");
		s.add("Sachin");
		s.add("Arun");
		s.add("Shiva");
		s.add("Vinay");
		
		Iterator<String> itr = s.iterator();
		
		while(itr.hasNext())
		{
			String s1 = itr.next();
			
			if(s1.startsWith("S"))
			{
				System.out.println(s1);
			}
			
		}
		
		

	}

}
