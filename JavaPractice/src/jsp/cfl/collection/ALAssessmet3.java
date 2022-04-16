package jsp.cfl.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ALAssessmet3 {

	public static void main(String[] args) 
	{
		
		List<Mobile> l = new ArrayList<Mobile>();
		
		l.add(new Mobile("Mi","White",750000.98));
		l.add(new Mobile("Oppo","Blue",780000.85));
		l.add(new Mobile("Realme","Red",850000));
		l.add(new Mobile("Samsung","Black",950000));
		l.add(new Mobile("Nokia","Green",650000));
		l.add(new Mobile("Sony","Rose",850000));
		l.add(new Mobile("Infinix","SkyBlue",850000));
		
		System.out.println("Name\t\tColr\t\tPrice");
		System.out.println("--------------------------------------------------");
		
		Collections.sort(l, new Mobile());
		
		for(int i = 0; i<l.size(); i++)
		{
			System.out.println(l.get(i));
		}

	}

}
