package jsp.cfl.collection;
import java.util.*;
public class HashSetDemo3 {

	public static void main(String[] args) 
	{
		Set<Integer> l = new LinkedHashSet<Integer>();
		
		l.add(10);
		l.add(10);
		l.add(10);
		l.add(10);
		l.add(10);
		l.add(10);
		l.add(10);
		l.add(10);
		
		System.out.println(l);
		

	}

}
