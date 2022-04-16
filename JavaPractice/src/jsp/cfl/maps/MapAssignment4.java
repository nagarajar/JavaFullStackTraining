package jsp.cfl.maps;
import java.util.*;
import java.util.Map.Entry;
public class MapAssignment4 {

	public static void main(String[] args) 
	{
		// WAP to read string and display all non repeated character
		Map<Character,Integer> m = new LinkedHashMap<Character,Integer>();
		
		System.out.println("Enter the string");
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		int count;
		char ch;
		for(int i=0; i<str.length();i++)
		{
			ch = str.charAt(i);
			if(m.containsKey(ch))
			{
				count = m.get(ch);
				count++;
				m.replace(ch, count);
			}
			else
			{
				m.put(ch, 1);
			}
		}
		Set<Entry<Character,Integer>> entries = m.entrySet();
		Iterator<Entry<Character,Integer>> itr = entries.iterator();
		
		while(itr.hasNext())
		{
			Entry<Character,Integer> e = itr.next();
			if(e.getValue() > 1)
			{
				System.out.print(e.getKey()+" ");
			}
		}


	}

}
