package jsp.cfl.assignments;
import java.util.*;
public class Assignment01 {

	public static void main(String[] args) 
	{
		List l = new ArrayList();
		
		l.add("Hell");
		l.add(10);
		l.add('A');
		l.add(10.22);
		l.add(100l);
		l.add(10.56f);
		l.add(20);
		l.add(5);
		l.add(7);
		l.add("Surajith");
		l.add("Varun");
		l.add("suvas");
		
		System.out.println(l);
		System.out.println("------------------------------------");
		System.out.println("a. Display only integer objects");
		System.out.println("------------------------------------");
		for(int i =0; i<l.size(); i++)
		{
			if(l.get(i) instanceof Integer )
			{
				System.out.println(l.get(i));
			}
		}
		
		System.out.println("------------------------------------");
		System.out.println("b. Display only even integer objects");
		System.out.println("------------------------------------");
		for(int i =0; i<l.size(); i++)
		{
			if(l.get(i) instanceof Integer )
			{
				Integer a = (Integer)l.get(i);
				if(a%2 == 0)
				{
					System.out.println(l.get(i));
				}
				
			}
		}
		
		System.out.println("------------------------------------");
		System.out.println("c. Display only String objects starting with 'S'");
		System.out.println("------------------------------------");
		for(int i =0; i<l.size(); i++)
		{
			if(l.get(i) instanceof String )
			{
				String a = (String)l.get(i);
				if(a.startsWith("S"))
				{
					System.out.println(l.get(i));
				}
				
			}
		}
		

	}

}
