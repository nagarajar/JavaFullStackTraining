package jsp.cfl.maps;
import java.util.*;
import java.util.Map.Entry;
import java.io.*;
public class MapAssignment6 {

	public static void main(String[] args) throws Exception
	{
		// WAP read and do the following
		
		BufferedReader br = new BufferedReader(new FileReader(new File("C:\\\\Users\\\\nagar\\\\Desktop\\\\Achivements.txt")));

		Map<String,Integer> m = new LinkedHashMap<String, Integer>();
		
		String line = "";
		
		int lineCount = 0;
		int wordsCount = 0;
		int duplicateWordsCount = 0;
		int spaceCount = 0;
		
		
		while((line = br.readLine()) != null)
		{
			int tempCount = 0;
			System.out.println(line);
			lineCount++;
			
			String[] str = line.split(" ");
			
			for(int i=0; i<str.length; i++)
			{
				wordsCount++;
				tempCount++;
				if(m.get(str[i]) == null)
				{
					m.put(str[i], 1);
				}
				else
				{
					m.put(str[i], m.get(str[i])+1);
				}
				
			}
			spaceCount = spaceCount+(tempCount - 1);
			
		}
		br.close();
		System.out.println("-------------------------------------");
		//1. Count the no.of lines
		System.out.println("No.of Lines = "+lineCount);
		System.out.println("-------------------------------------");
		
		Iterator<Entry<String, Integer>> itr = m.entrySet().iterator();
		System.out.println("Keys\t\tValues");
		System.out.println("-------------------------------------");
		while(itr.hasNext())
		{
			Entry<String,Integer> e = itr.next();
			System.out.println(e.getKey()+"\t\t"+e.getValue());
		}
		System.out.println("-------------------------------------");
		//2. Count the no.of words
		System.out.println("No.of words = "+wordsCount);
		
		//3. Display the words occurred more than twice
		System.out.println("-------------------------------------");
		System.out.println("The words occurred more than twice");
		System.out.println("-------------------------------------");
		itr = m.entrySet().iterator();
		
		while(itr.hasNext())
		{
			Entry<String,Integer> e = itr.next();
			if(e.getValue() > 2)
			{
				System.out.println(e.getKey());
			}
			
		}
		//4. Display the 1st non- repeated word
		System.out.println("-------------------------------------");
		System.out.println("The 1st non- repeated word");
		System.out.println("-------------------------------------");
		itr = m.entrySet().iterator();
		
		while(itr.hasNext())
		{
			Entry<String,Integer> e = itr.next();
			if(e.getValue() == 1)
			{
				System.out.println(e.getKey());
				break;
			}
			
		}
		
		//5. Count the duplicate words
		System.out.println("-------------------------------------");
		System.out.println("Count the duplicate words");
		System.out.println("-------------------------------------");
		itr = m.entrySet().iterator();
		
		while(itr.hasNext())
		{
			Entry<String,Integer> e = itr.next();
			if(e.getValue() > 1)
			{
				duplicateWordsCount++;
			}
			
		}
		System.out.println("No.of duplicate words = "+duplicateWordsCount);
		
		//6. Count the no.of spaces
		System.out.println("-------------------------------------");
		System.out.println("Count the no.of spaces");
		System.out.println("-------------------------------------");
	
		System.out.println("No.of spaces = "+spaceCount);
		
	}

}
