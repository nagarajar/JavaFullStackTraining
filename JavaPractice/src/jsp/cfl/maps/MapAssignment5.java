package jsp.cfl.maps;
import java.util.*;
import java.util.Map.Entry;
public class MapAssignment5 
{

	public static void main(String[] args) 
	{
		// WAP to read string and display number of occurrence of each word
		Map<String, Integer> m = new LinkedHashMap<String, Integer>();
		System.out.println("Enter the string");
		Scanner sc = new Scanner(System.in);
		String[] str = sc.nextLine().split(" ");
		
		for(int i=0; i<str.length; i++)
		{
			if(m.get(str[i]) == null)
			{
				m.put(str[i], 1);
			}
			else
			{
				m.put(str[i], m.get(str[i])+1);
			}
		}
		
		Iterator<Entry<String,Integer>> itr = m.entrySet().iterator();
		while(itr.hasNext())
		{
			Entry<String,Integer> e = itr.next();
			System.out.println(e.getKey()+"\t"+e.getValue());
		}

	}

}
