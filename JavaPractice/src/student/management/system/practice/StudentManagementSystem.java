package student.management.system.practice;
import java.util.*;
public class StudentManagementSystem 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		StudentDataBase sdb = new StudentDataBase(new ArrayList<Student>(), sc);
		
		System.out.println("Welcome to Student management system..........!");
		while(true)
		{
			System.out.println("Choose the below option as per your wish.......!");
			System.out.println("1. Add\n2. Remove\n3. Display\n4. Search\n5. Update\n6. Sort\n7. Exit");
			
			int ch = sc.nextInt();
			
			switch(ch)
			{
				case 1:sdb.addStudent();
					break;
				case 2:sdb.removeStudent();
					break;
				case 3:sdb.displayStudent();
					break;
				case 4:sdb.searchStudent();
					break;
				case 5:sdb.updateStudent();
					break;
				case 6:sdb.sortStudent();
					break;
				case 7: System.exit(0);
					
			}
		}

	}

}
