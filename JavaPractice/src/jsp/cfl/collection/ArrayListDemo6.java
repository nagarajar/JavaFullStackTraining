package jsp.cfl.collection;
import java.util.*;
public class ArrayListDemo6 {

	public static void main(String[] args) 
	{
		List<Integer> l = new ArrayList<Integer>();
		
		l.add(10);
		l.add(50);
		l.add(20);
		l.add(30);
		l.add(100);
		l.add(15);
		l.add(19);
		
		System.out.println("Using for loop");
		System.out.println("---------------------------------");
		for(int i = 0; i<l.size(); i++)
		{
			System.out.print(l.get(i)+" ");
		}
		System.out.println();
		
		Iterator<Integer> itr = l.iterator();
		System.out.println("\nUsing Iterator");
		System.out.println("---------------------------------");
		while(itr.hasNext()) 
		{
			System.out.print(itr.next()+" ");
		}
		System.out.println();
		
		ListIterator<Integer> itr1 = l.listIterator();
		System.out.println("\nUsing ListIterator Forward");
		System.out.println("---------------------------------");
		while(itr1.hasNext()) 
		{
			System.out.print(itr1.next()+" ");
		}
		System.out.println();
		
		
		System.out.println("\nUsing ListIterator Backward");
		System.out.println("---------------------------------");
		while(itr1.hasPrevious()) 
		{
			System.out.print(itr1.previous()+" ");
		}
		System.out.println();
		

	}

}
