package jsp.cfl.assignments;

import java.util.*;
import java.util.Map.Entry;

public class CitizenDataBase 
{
	private Map<Integer,Citizen> m;
	private Scanner sc;
	Iterator<Entry<Integer,Citizen>> itr;
	public CitizenDataBase()
	{
		
	}
	public CitizenDataBase(Map<Integer,Citizen> m, Scanner sc)
	{
		this.m = m;
		this.sc = sc;
	}
	public void addCitizen()
	{
		System.out.println("Enter how many Citizens you want to add");
		int size = sc.nextInt();
		int i = 0;
		
		Citizen c;
		int id;
		while(i<size)
		{
			System.out.println("Enter ID ");
			id = sc.nextInt();
			c = citizenDetails();
			m.put(id, c);
			i++;
		}
	}
	public Citizen citizenDetails()
	{
		sc.nextLine();
		System.out.println("Enter Citizen name");
		String name = sc.nextLine();
		System.out.println("Enter Citizen age");
		int age = sc.nextInt();
		
		return new Citizen(name, age);
		
	}
	public void displayCitizenIdNameAge()
	{
		if(!m.isEmpty())
		{
			itr = m.entrySet().iterator();
			System.out.println("----------------------------------");
			System.out.println("Keys\t\tValues");
			System.out.println("----------------------------------");
			while(itr.hasNext())
			{
				Entry<Integer,Citizen> e = itr.next();
				System.out.println(e.getKey()+"\t\t"+e.getValue());
			}
		}
		else 
		{
			System.out.println("this map is empty.......!");
		}

	}
	public void searchCitizen()
	{
		if(!m.isEmpty())
		{
			System.out.println("Enter Citizen Id to search:");
			int a = sc.nextInt();
			
			itr = m.entrySet().iterator();
			
			while(itr.hasNext())
			{
				Entry<Integer,Citizen> e = itr.next();
				if((Integer)e.getKey() == (Integer)a)
				{
					System.out.println("Citizen Id = "+e.getKey()+" exist and value is = "+e.getValue());
					return;
				}	
			}
			
			System.out.println("Citizen Id = "+a+" not exist...!"); 
		}
		else 
		{
			System.out.println("this map is empty.......!");
		}
	}
	public void removeCitizen()
	{
		if(!m.isEmpty())
		{
			System.out.println("Enter Citizen Id to remove:");
			int a = sc.nextInt();
			
			itr = m.entrySet().iterator();
		
			while(itr.hasNext())
			{
				Entry<Integer,Citizen> e = itr.next();
				if((Integer)e.getKey() == (Integer)a)
				{
					itr.remove();
					System.out.println("Citizen Id = "+e.getKey()+" is removed successfully");
					System.out.println("************ Map of Citizen after removing \"************ ");
					displayCitizenIdNameAge();
					return;
					
				}
				
			}
			System.out.println("Citizen Id = "+a+" not exist...!"); 
		}
		else 
		{
			System.out.println("this map is empty.......!");
		}
	}
	public void displayCitizenId()
	{
		if(!m.isEmpty())
		{
			itr = m.entrySet().iterator();
			System.out.println("----------------------------------");
			System.out.println("Keys");
			System.out.println("----------------------------------");
			while(itr.hasNext())
			{
				Entry<Integer,Citizen> e = itr.next();
				System.out.println(e.getKey());
			}
		}
		else 
		{
			System.out.println("this map is empty.......!");
		}
	}
	public void displayCitizenName()
	{
		if(!m.isEmpty())
		{
			itr = m.entrySet().iterator();
			System.out.println("----------------------------------");
			System.out.println("Values");
			System.out.println("----------------------------------");
			while(itr.hasNext())
			{
				Entry<Integer,Citizen> e = itr.next();
				System.out.println(e.getValue().getName());
			}
		}
		else 
		{
			System.out.println("this map is empty.......!");
		}
	}
	

}
