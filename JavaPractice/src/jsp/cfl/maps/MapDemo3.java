package jsp.cfl.maps;
import java.util.*;
public class MapDemo3 
{

	public static void main(String[] args)
	{
		Map<Character,Integer> m = new LinkedHashMap<Character,Integer>();
		
		int v = 1;
		for(char c = 'a'; c<= 'z'; c++,v++)
		{
			m.put(c, v);
		}
		
		
		
		System.out.println("Enter the String");
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		int total = 0;
		for(int i=0; i< str.length(); i++)
		{
			char c = str.charAt(i);
			
			total += m.get(c);
			
		}
		System.out.println("Total = "+total);
		sc.close();

	}

}
