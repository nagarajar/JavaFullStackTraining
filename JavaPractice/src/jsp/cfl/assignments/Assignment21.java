package jsp.cfl.assignments;

import java.util.*;

public class Assignment21
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		CitizenDataBase cdb = new CitizenDataBase(new HashMap<Integer,Citizen>(), sc);
		while(true)
		{
			System.out.println("1. Add\n2. Display Citizen Id, Name & Age\n3. Search\n4. Remove\n5. Disply only Citizen Id\n6. Disply only Citizen Name\n7. Exit");
			System.out.println("Select above option");
			int ch = sc.nextInt();
			
			switch(ch)
			{
				case 1: cdb.addCitizen();
						break;
				case 2: cdb.displayCitizenIdNameAge();
						break;
				case 3: cdb.searchCitizen();
						break;
				case 4: cdb.removeCitizen();
						break;
				case 5: cdb.displayCitizenId();
						break;
				case 6: cdb.displayCitizenName();
						break;
				case 7: System.exit(0);;		
							
			}
		}
	}
}
