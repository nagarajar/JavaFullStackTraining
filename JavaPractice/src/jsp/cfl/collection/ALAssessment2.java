package jsp.cfl.collection;

import java.util.*;

public class ALAssessment2 
{

		public static void main(String[] args) 
		{
			List<Car> l = new ArrayList<Car>();
			
			l.add(new Car("White",2020,750000.98));
			l.add(new Car("Blue",2019,780000.85));
			l.add(new Car("Red",2017,850000));
			l.add(new Car("Black",2020,950000));
			l.add(new Car("Green",2018,650000));
			
			System.out.println("Color\t\tYear\t\tPrice");
			System.out.println("--------------------------------------------------");
			
			Collections.sort(l, new Car());
			
			for(int i = 0; i<l.size(); i++)
			{
				System.out.println(l.get(i));
			}
		}
			

}
