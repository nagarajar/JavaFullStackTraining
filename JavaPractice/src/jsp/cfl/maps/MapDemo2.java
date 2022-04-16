package jsp.cfl.maps;
import java.util.*;
import java.util.Map.Entry;
public class MapDemo2 implements Comparator<Integer>
{

	public static void main(String[] args) 
	{
		//Map<Integer, String> m = new HashMap<Integer, String>(); // without preserving insertion order
		//Map<Integer, String> m = new LinkedHashMap<Integer, String>(); // with preserving insertion order
		//Map<Integer, String> m = new TreeMap<Integer, String>(); // sorting by default as ASC order
		Map<Integer, String> m = new TreeMap<Integer, String>(new MapDemo2()); // sorting by  ASC or DSC order
		
		m.put(10, "Karnataka");
		m.put(40, "Tamilnadu");
		m.put(30, "Andra Pradesh");
		m.put(20, "Maharasta");
		m.put(50, "Goa");
		m.put(80, "Gujarath");
		m.put(60, "Rajastan");
		
		Set<Entry<Integer, String>> entries = m.entrySet();
		Iterator<Entry<Integer, String>> itr = entries.iterator();
		
		System.out.println("Keys\t\tValues");
		System.out.println("------------------------");
		while(itr.hasNext())
		{
			Entry<Integer, String> e = itr.next();
			System.out.println(e.getKey()+"\t\t"+e.getValue());
		}
		
		
		

	}
	
	@Override
	public int compare(Integer e1, Integer e2)
	{
		return e2.compareTo(e1);
	}

}
