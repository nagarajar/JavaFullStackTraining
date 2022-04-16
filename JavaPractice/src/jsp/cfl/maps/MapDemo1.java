package jsp.cfl.maps;
import java.util.*;
public class MapDemo1 {

	public static void main(String[] args) 
	{
		Map m = new HashMap();
		
		m.put(10, "Hello");
		m.put("Jsp", "Hello");
		m.put(20, 10.55);
		m.put(null, 'A');
		m.put(40, null);
		m.put(50, "Hello");
		m.put("Qsp", "Hello");
		
		System.out.println(m); // {null=A, 50=Hello, 20=10.55, Jsp=Hello, 40=null, 10=Hello, Qsp=Hello}
		
		System.out.println(m.containsKey(10));
		System.out.println(m.containsValue(100));
		
		System.out.println(m.get("Jsp"));
		m.remove("Qsp");
		
		System.out.println(m); // {null=A, 50=Hello, 20=10.55, Jsp=Hello, 40=null, 10=Hello}
		
		System.out.println(m.put(10, "India"));
		
		System.out.println(m); // {null=A, 50=Hello, 20=10.55, Jsp=Hello, 40=null, 10=India}
		
		Set keys = m.keySet();
		
		System.out.println("Keys "+keys);
		
		Collection values = m.values();
		
		System.out.println("Values "+values);
		
		Set entries = m.entrySet();
		System.out.println("Entries "+entries);
		
		
		

	}

}
