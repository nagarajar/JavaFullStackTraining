package jsp.cfl.collection;

import java.util.*;

public class Employee implements Comparator<Employee>
{
	private String name;
	private int id;
	private double sal;
	
	public Employee() 
	{
		
	}
	
	public Employee(String name, int id, double sal) 
	{
		this.name = name;
		this.id = id;
		this.sal = sal;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}
	
	public String toString()
	{
		return name+"\t\t"+id+"\t\t"+sal;
	}
	
	@Override
	public int compare(Employee e1, Employee e2)
	{
		if(e1.sal == e2.sal)
		{
			return e1.name.compareTo(e2.name);
		}
		else
		{
			return ((Double)e2.sal).compareTo(e1.sal);
		}
	}
}
