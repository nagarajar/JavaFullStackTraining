package jsp.cfl.collection;
import java.util.*;
public class HashSetDemo2 {

	public static void main(String[] args) 
	{
		Set<Student> s = new HashSet<Student>();
		
		s.add(new Student("Naga",10,78.12));
		s.add(new Student("Ankith",30,58.12));
		s.add(new Student("Sachin",40,88.42));
		s.add(new Student("Arun",20,72.12));
		s.add(new Student("Akshy",50,68.12));
		s.add(new Student("Vinya",60,62.12));
		s.add(new Student("Vinya",60,62.12));
		s.add(new Student("Akshy",50,68.12));
		
		System.out.println("Name\t\tID\t\tMarks");
		System.out.println("---------------------------------------------");
		Iterator itr = s.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		/*itr = s.iterator(); // case 2
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		*/
		/*itr = s.iterator(); // Case 3
		while(itr.hasNext())
		{
			itr.next();
			itr.remove();
		}
		System.out.println();
		System.out.println(s);
		*/
		
		itr = s.iterator(); // Case 4: we should use remove method only after using next method
		while(itr.hasNext())
		{
			itr.remove();
		}
		System.out.println();
		System.out.println(s); //Exception in thread "main" java.lang.IllegalStateException
	}

}
