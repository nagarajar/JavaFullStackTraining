package student.database.application;

import java.util.*;

public class StudentDataBaseApp {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		StudentDataBase sdb = new StudentDataBase(new ArrayList<Student>(),sc);
		System.out.println("Welcome to Student DataBase Application........!");
		while(true)
		{
			System.out.println("Choose below options as per your wish..........!");
			
			System.out.println("1. Add Students\n2. Pay Tuition Fees\n3. Display Students Information");
			
			int ch = sc.nextInt();
			
			switch(ch)
			{
				case 1:sdb.addStudents();
					break;
				case 2:sdb.payBalanceTuitionFees();
					break;
				case 3:sdb.displyStudents();
					break;
				case 4:System.exit(0);
			}
		}
		

	}

}
