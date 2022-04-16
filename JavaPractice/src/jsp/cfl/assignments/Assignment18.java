package jsp.cfl.assignments;
import java.util.*;
import java.util.Map.Entry;
public class Assignment18 {

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		Assignment18DataBase adb = new Assignment18DataBase(new HashMap<Integer,String>(), sc);
		while(true)
		{
			System.out.println("1. Add\n2. Display Emp Id & Name\n3. Search\n4. Remove\n5. Disply only Emp Id\n6. Disply only Emp Name\n7. Exit");
			System.out.println("Select above option");
			int ch = sc.nextInt();
			
			switch(ch)
			{
				case 1: adb.addEmployee();
						break;
				case 2: adb.displayEmpIdName();
						break;
				case 3: adb.searchEmployee();
						break;
				case 4: adb.removeEmployee();
						break;
				case 5: adb.displayEmpId();
						break;
				case 6: adb.displayEmpName();
						break;
				case 7: System.exit(0);;		
							
			}
		}

		

	}

}
