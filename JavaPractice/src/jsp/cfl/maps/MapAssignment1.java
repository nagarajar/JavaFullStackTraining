package jsp.cfl.maps;
import java.util.*;
import java.util.Map.Entry;
public class MapAssignment1 {
	public static void main(String[] args) 
	{
		// WAP to read string and display number of occurrence of each character	
		Map<Character, Integer> m = new LinkedHashMap<Character, Integer>();
			
		System.out.println("Enter the String");
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		int count;
		char ch;
		
		for(int i=0; i< str.length(); i++)
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
				m.put(ch,1);
			}	
		}
		Set<Entry<Character,Integer>> entries = m.entrySet();
		
		Iterator itr = entries.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
			
		sc.close();

	}

}
