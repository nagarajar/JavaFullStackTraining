package student.management.system;

import java.util.*;

public class StudentDataBase 
{
	private List<Student> l;
	private Scanner sc;
	
	public StudentDataBase()
	{
		
	}
	
	public StudentDataBase(List<Student> l, Scanner sc)
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
		
		System.out.println("Enter Student Mobile");
		long mobile = sc.nextLong();
		
		return new Student(name,id,marks,mobile);
	}
	public void removeStudent()
	{
		if(!l.isEmpty())
		{
			System.out.println("Enter the id of student to remove");
			int id = sc.nextInt();
			for(int i = 0;i<l.size();i++)
			{
				if(l.get(i).getId() == id)
				{
					l.remove(i);
					System.out.println("********** List After Removing **********");
					dispStudent();
					return;
				}
			}
			System.out.println("Student with id = "+id+" doesn't exist...!");
		}
		else
		{
			System.out.println("List is Empty !! can't remove");
		}
	}
	public void dispStudent()
	{
		System.out.println("Name\t\tId\t\tMarks\t\tMobile");
		System.out.println("-------------------------------------------------------------");
		
		for(int i=0;i<l.size();i++)
		{
			System.out.println(l.get(i));
		}
	}
	public void searchStudent()
	{
		if(!l.isEmpty())
		{
			System.out.println("Enter the id of student to search");
			int id = sc.nextInt();
			for(int i = 0;i<l.size();i++)
			{
				if(l.get(i).getId() == id)
				{
					System.out.println("Student with id = "+id+" exist...!");
					return;
				}
			}
			System.out.println("Student with id = "+id+" doesn't exist...!");
		}
		else
		{
			System.out.println("List is Empty !! can't search");
		}
	}
	public void updateStudent()
	{
		if(!l.isEmpty())
		{
			System.out.println("What you want to update..??\n1. Marks\n2. Mobile");
			int ch = sc.nextInt();
			if(ch == 1)
			{
				updateMarks();
			}
			else
			{
				updateMobile();
			}
		
			
		}
		else
		{
			System.out.println("List is Empty !! can't update");
		}
	}
	public void updateMarks()
	{
		System.out.println("Enter the id of student to update marks");
		int id = sc.nextInt();
		for(int i = 0;i<l.size();i++)
		{
			if(l.get(i).getId() == id)
			{
				System.out.println("Enter the new marks");
				double nmarks = sc.nextDouble();
				l.get(i).setMarks(nmarks);
				System.out.println("********** After Updating Marks **********");
				dispStudent();
				return;
			}
		}
		System.out.println("Student with id = "+id+" doesn't exist...!");
	}
	public void updateMobile()
	{
		System.out.println("Enter the id of student to update mobile");
		int id = sc.nextInt();
		for(int i = 0;i<l.size();i++)
		{
			if(l.get(i).getId() == id)
			{
				System.out.println("Enter the new mobile number ");
				long nmobile = sc.nextLong();
				l.get(i).setMobile(nmobile);
				System.out.println("********** After Updating Mobile **********");
				dispStudent();
				return;
			}
		}
		System.out.println("Student with id = "+id+" doesn't exist...!");
	}
	public void sortStudent()
	{
		if(!l.isEmpty())
		{
			System.out.println("In order you want to sort..??\n1. ASC\n2. DSC");
			int ch1 = sc.nextInt();
			if(ch1 == 1)
			{
				sortASC();
			}
			else if(ch1 == 2)
			{
				sortDSC();
			}
			else
			{
				System.out.println("Invalid option........!");
			}
		
			
		}
		else
		{
			System.out.println("List is Empty !! can't sort");
		}
	}
	public void sortASC()
	{
		System.out.println("you want to sort in ASC based on..??\n1. Name\n2. ID\n3. Marks");
		int ch2 = sc.nextInt();
		if(ch2 == 1)
		{
			sortASCName();
		}
		else if(ch2 == 2)
		{
			sortASCId();
		}
		else if(ch2 == 3)
		{
			sortASCMarks();
		}
		else
		{
			System.out.println("Invalid option........!");
		}
	}
	public void sortASCName()
	{
		Collections.sort(l, new Student());
	}
	public void sortASCId()
	{
		
	}
	public void sortASCMarks()
	{
		
	}
	public void sortDSC()
	{
		System.out.println("you want to sort in DSC based on..??\n1. Name\n2. ID\n3. Marks");
		int ch3 = sc.nextInt();
		if(ch3 == 1)
		{
			sortDSCName();
		}
		else if(ch3 == 2)
		{
			sortDSCId();
		}
		else if(ch3 == 3)
		{
			sortDSCMarks();
		}
		else
		{
			System.out.println("Invalid option........!");
		}
	}
	public void sortDSCName()
	{
		
	}
	public void sortDSCId()
	{
		
	}
	public void sortDSCMarks()
	{
		
	}
}
