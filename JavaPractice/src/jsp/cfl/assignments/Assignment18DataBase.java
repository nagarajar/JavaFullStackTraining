package jsp.cfl.assignments;
import java.util.*;
import java.util.Map.Entry;
public class Assignment18DataBase 
{
	private Map<Integer,String> m;
	private Scanner sc;
	Iterator<Entry<Integer,String>> itr;
	public Assignment18DataBase()
	{
		
	}
	public Assignment18DataBase(Map<Integer,String> m, Scanner sc)
	{
		this.m = m;
		this.sc = sc;
	}
	public void addEmployee()
	{
		System.out.println("Enter how many employees you want to add");
		int size = sc.nextInt();
		int i = 0;
		System.out.println("Enter ID and Name of Employee");
		while(i<size)
		{
				m.put(sc.nextInt(), sc.nextLine());
				i++;
		}
	}
	public void displayEmpIdName()
	{
		if(!m.isEmpty())
		{
			itr = m.entrySet().iterator();
			System.out.println("----------------------------------");
			System.out.println("Keys\t\tValues");
			System.out.println("----------------------------------");
			while(itr.hasNext())
			{
				Entry<Integer,String> e = itr.next();
				System.out.println(e.getKey()+"\t\t"+e.getValue());
			}
		}
		else 
		{
			System.out.println("this map is empty.......!");
		}

	}
	public void searchEmployee()
	{
		if(!m.isEmpty())
		{
			System.out.println("Enter Emp Id to search:");
			int a = sc.nextInt();
			
			itr = m.entrySet().iterator();
			
			while(itr.hasNext())
			{
				Entry<Integer,String> e = itr.next();
				if((Integer)e.getKey() == (Integer)a)
				{
					System.out.println("Employee Id = "+e.getKey()+" exist and value is = "+e.getValue());
					return;
				}	
			}
			
			System.out.println("Employee Id = "+a+" not exist...!"); 
		}
		else 
		{
			System.out.println("this map is empty.......!");
		}
	}
	public void removeEmployee()
	{
		if(!m.isEmpty())
		{
			System.out.println("Enter Emp Id to remove:");
			int a = sc.nextInt();
			
			itr = m.entrySet().iterator();
		
			while(itr.hasNext())
			{
				Entry<Integer,String> e = itr.next();
				if((Integer)e.getKey() == (Integer)a)
				{
					itr.remove();
					System.out.println("Employee Id = "+e.getKey()+" is removed successfully");
					System.out.println("************ Map of empioyee after removing \"************ ");
					displayEmpIdName();
					return;
					
				}
				
			}
			System.out.println("Employee Id = "+a+" not exist...!"); 
		}
		else 
		{
			System.out.println("this map is empty.......!");
		}
	}
	public void displayEmpId()
	{
		if(!m.isEmpty())
		{
			itr = m.entrySet().iterator();
			System.out.println("----------------------------------");
			System.out.println("Keys");
			System.out.println("----------------------------------");
			while(itr.hasNext())
			{
				Entry<Integer,String> e = itr.next();
				System.out.println(e.getKey());
			}
		}
		else 
		{
			System.out.println("this map is empty.......!");
		}
	}
	public void displayEmpName()
	{
		if(!m.isEmpty())
		{
			itr = m.entrySet().iterator();
			System.out.println("----------------------------------");
			System.out.println("Values");
			System.out.println("----------------------------------");
			while(itr.hasNext())
			{
				Entry<Integer,String> e = itr.next();
				System.out.println(e.getValue());
			}
		}
		else 
		{
			System.out.println("this map is empty.......!");
		}
	}
	

}
