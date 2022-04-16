package student.management.system.practice;
import java.util.*;
public class StudentDataBase 
{
	private List<Student> l;
	private Scanner sc;
	public StudentDataBase(List<Student> l, Scanner sc )
	{
		this.l = l;
		this.sc = sc;
	}
	public void addStudent()
	{
		Student s = readStudentDetails();
		l.add(s);
	}
	public Student readStudentDetails()
	{
		sc.nextLine();
		System.out.println("Enter Student Name");
		String name = sc.nextLine();
		System.out.println("Enter Student ID");
		int id = sc.nextInt();
		System.out.println("Enter Student Marks");
		double marks = sc.nextDouble();
		System.out.println("Enter Student Mobile Number");
		long mobile = sc.nextLong();
		
		return new Student(name,id,marks,mobile);
	
	}
	public void removeStudent()
	{
		if(!l.isEmpty())
		{
			System.out.println("Enter thr Student id to remove");
			int id = sc.nextInt();
			
			Iterator<Student> itr = l.iterator();
			while(itr.hasNext())
			{
				if(itr.next().getId() == id)
				{
					itr.remove();
					System.out.println("The Sudent id = "+id+" removed successfully from the list.....!");
					System.out.println("*************** Student list after removing ***************");
					displayStudent();
					return;
					
				}
				
			}
			System.out.println("The Sudent id = "+id+" not exist.....!");
			
		}
		else
		{
			System.out.println("The list is empty, we can't perform remove operation ....!");
		}
	}
	public void displayStudent()
	{
		System.out.println("Name\t\tID\t\tMarks\t\tMobile");
		System.out.println("--------------------------------------------------");
		Iterator<Student> itr = l.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
	public void searchStudent()
	{
		if(!l.isEmpty())
		{
			System.out.println("Enter thr Student id to search");
			int id = sc.nextInt();
			
			Iterator<Student> itr = l.iterator();
			while(itr.hasNext())
			{
				if(itr.next().getId() == id)
				{
					System.out.println("The Sudent id = "+id+" is exist in the list.....!");
					return;
					
				}
				
			}
			System.out.println("The Sudent id = "+id+" not exist.....!");
		}
		else
		{
			System.out.println("The list is empty, we can't perform remove operation ....!");
		}
		
	}
	public void updateStudent()
	{
		if(!l.isEmpty())
		{
			System.out.println("What you want to update \n1. Name\n2. Marks\n3. Mobile Number");
			int ch = sc.nextInt();
			if(ch == 1)
			{
				updateName();
			}
			else if(ch == 2)
			{
				updateMarks();
			}
			else if(ch == 3)
			{
				updateMobile();
			}
			else
			{
				System.out.println("Invalid choice........!");
			}
		}
		else
		{
			System.out.println("The list is empty, we can't perform remove operation ....!");
		}
		
	}
	public void updateName()
	{
		System.out.println("Enter the Student id to update name");
		int id = sc.nextInt();
		
		for(int i = 0;i<l.size();i++)
		{
			if(l.get(i).getId() == id)
			{
				System.out.println("Enter the new name");
				sc.nextLine();
				String name = sc.nextLine();
				l.get(i).setName(name);
				System.out.println("The Sudent id = "+id+" name updated successfully in list.....!");
				System.out.println("*************** Student list after updating name ***************");
				displayStudent();
				return;
				
			}
			
		}
		System.out.println("The Sudent id = "+id+" not exist.....!");
	}
	public void updateMarks()
	{
		System.out.println("Enter the Student id to update marks");
		int id = sc.nextInt();
		
		for(int i = 0;i<l.size();i++)
		{
			if(l.get(i).getId() == id)
			{
				System.out.println("Enter the new marks");
				double nmarks = sc.nextDouble();
				l.get(i).setMarks(nmarks);
				System.out.println("The Sudent id = "+id+" marks updated successfully in list.....!");
				System.out.println("*************** Student list after updating marks ***************");
				displayStudent();
				return;
				
			}
			
		}
		System.out.println("The Sudent id = "+id+" not exist.....!");
	}
	public void updateMobile()
	{
		System.out.println("Enter the Student id to update mobile number");
		int id = sc.nextInt();
		
		for(int i = 0;i<l.size();i++)
		{
			if(l.get(i).getId() == id)
			{
				System.out.println("Enter the new mobile number");
				long nmobile = sc.nextLong();
				l.get(i).setMobile(nmobile);
				System.out.println("The Sudent id = "+id+" mobile number updated successfully in list.....!");
				System.out.println("*************** Student list after updating mobile number ***************");
				displayStudent();
				return;
				
			}
			
		}
		System.out.println("The Sudent id = "+id+" not exist.....!");
	}

	public void sortStudent()
	{
		if(!l.isEmpty())
		{
			Collections.sort(l, new Student());
			System.out.println("*************** Student list after sorting based on ID ***************");
			displayStudent();
			return;
			
		}
		else
		{
			System.out.println("The list is empty, we can't perform remove operation ....!");
		}
		
	}
	
}
