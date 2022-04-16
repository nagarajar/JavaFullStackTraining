package jsp.cfl.collection;

import java.util.*;

public class TreeSetAssessment2 implements Comparator<Mobile>
{

	public static void main(String[] args) 
	{
		//WAP to sort all mobile based on the brand name if the name is same then sort based price in decreasing order
		SortedSet<Mobile> s = new TreeSet<Mobile>(new TreeSetAssessment2());
		
		s.add(new Mobile("Mi","White",750000.98));
		s.add(new Mobile("Oppo","Blue",780000.85));
		s.add(new Mobile("Realme","Red",850000));
		s.add(new Mobile("Samsung","Black",950000));
		s.add(new Mobile("Nokia","Green",650000));
		s.add(new Mobile("Sony","Rose",850000));
		s.add(new Mobile("Infinix","SkyBlue",850000));
		s.add(new Mobile("Mi","Blue",760000.98));
		
		System.out.println("Name\t\tColr\t\tPrice");
		System.out.println("--------------------------------------------------");
		
		Iterator itr = s.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		
		
	}

	@Override
	public int compare(Mobile m1, Mobile m2)
	{
		if(m1.getName() == m2.getName())
		{
			return ((Double)m2.getPrice()).compareTo(m1.getPrice());
		}
		else
		{
			return m1.getName().compareTo(m2.getName());
		}
		
	}
}
