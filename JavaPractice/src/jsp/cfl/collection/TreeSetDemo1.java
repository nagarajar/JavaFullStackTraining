package jsp.cfl.collection;
import java.util.*;
public class TreeSetDemo1 {

	public static void main(String[] args) 
	{
		// By default this constructor will sort as ASC
		SortedSet<Integer> s = new TreeSet<Integer>();
		
		s.add(10);
		s.add(15);
		s.add(5);
		s.add(1);
		s.add(35);
		s.add(80);
		s.add(40);
		s.add(15);
		s.add(5);
		
		System.out.println(s);
		

	}

}
