package student.database.application;
import java.util.*;
public class StudentDataBase 
{
	private List<Student> l;
	private Scanner sc;
	private int id = 1000;
	double tuitionFees;
	double balance;
	double costOfCoures = 600;
	public StudentDataBase(List<Student> l, Scanner sc)
	{
		this.l = l;
		this.sc = sc;
	}
	public void addStudents()
	{
		Student s =readStudentDetails();
		l.add(s);
	}
	public Student readStudentDetails()
	{
		sc.nextLine();
		System.out.println("Enter first name");
		String fname = sc.nextLine();
		System.out.println("Enter last name");
		String lname = sc.nextLine();
		System.out.println("Enter Year");
		int year = sc.nextInt();
		System.out.println("Select student grade level\n1. Freshemen\n2. Sophmore\n3. Senior");
		int grade = sc.nextInt();
		String studentId = generateStudentId(grade);
		tuitionFees = 0;
		balance = 0;
		String courses = coursesEnrolling();
		
		System.out.println("Tuition fees = $"+tuitionFees);
		System.out.println("Do you want pay tuition fees\n* Yes * No");
		String feespay = sc.nextLine();
		if(feespay.equalsIgnoreCase("yes"))
		{
			balance = payTuitionFees();
			if(balance > 0)
			{
				System.out.println("Remaining Balance is $"+balance);
			}
			else
			{
				System.out.println("Thank for paying tuition fees....!");
			}
		}
		else
		{
			balance = tuitionFees;
		}
		
		return new Student(fname,lname,year,grade,studentId,courses,balance,tuitionFees);
		
	}
	public String generateStudentId(int grade)
	{
		id++;
		return grade+""+id;
	}
	public String coursesEnrolling()
	{
		sc.nextLine();
		System.out.println("Following are the courses available");
		System.out.println("a. History 101\nb. Mathematics 101\nc. English 101\nd. Chemistry 101\ne. Computer Science 101");
		
		
		String courses = "";
		
		while(true)
		{
			String course = "";
			System.out.println("Select above courses to enroll (Q - Quite):");
			
			String ch = sc.nextLine();
			
			if(ch.equals("a"))
			{
				course ="\t\t   * History 101 ";
				courses = courses +"\n"+course;
				tuitionFees += costOfCoures;
				
			}
			else if(ch.equals("b"))
			{	
				course ="\t\t   * Mathematics 101 ";
				courses = courses +"\n"+course;
				tuitionFees += costOfCoures;
			}
			else if(ch.equals("c"))
			{
				course ="\t\t   * English 101 ";
				courses = courses +"\n"+course;
				tuitionFees += costOfCoures;
			}
			else if(ch.equals("d"))
			{
				course ="\t\t   * Chemistry 101 ";
				courses = courses +"\n"+course;
				tuitionFees += costOfCoures;
			}
			else if(ch.equals("e"))
			{
				course ="\t\t   * Computer Science 101 ";
				courses = courses +"\n"+course;
				tuitionFees += costOfCoures;
			}
			else if(ch.equals("Q"))
			{
				break;
			}
			else
			{
				System.out.println("Invalid selection....!");
			}
		}
		
		return courses;
		
	}
	public double payTuitionFees()
	{
		System.out.println("How much you want to pay");
		double pay = sc.nextDouble();
		tuitionFees = tuitionFees - pay;
		balance = tuitionFees;
		return balance;
	}
	public void displyStudents()
	{
		Iterator<Student> itr = l.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
	
	public void payBalanceTuitionFees()
	{
		if(!l.isEmpty())
		{
			sc.nextLine();
			System.out.println("Enter Student ID : ");
			String id = sc.nextLine();
			
			for(int i = 0; i< l.size(); i++)
			{
				if(l.get(i).getStudentId().equals(id))
				{
					System.out.println("Tuition Fees $"+tuitionFees);
					balance = payTuitionFees();
					if(balance > 0)
					{
						System.out.println("Remaining Balance is $"+balance);
					}
					else
					{
						System.out.println("Thank for paying tuition fees....!");
					}
					return;
				}
			}
			System.out.println("Student ID : "+id+ " is not exist......!");
			
		}
		else
		{
			System.out.println("Student data base is empty....!");
		}
	}
}
