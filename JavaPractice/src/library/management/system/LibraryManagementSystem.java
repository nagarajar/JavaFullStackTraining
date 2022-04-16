package library.management.system;

import java.util.*;
public class LibraryManagementSystem {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		LibraryInformation li = new LibraryInformation(new ArrayList<Book>(), sc);
		
		System.out.println("Welcome to Library Management System");
		while(true)
		{
			System.out.println("Choose below options to perform respective operation.....!");
		
			System.out.println("1. Add\n2. Remove\n3. Search\n4. Display\n5. Update\n6. Sort\n7. Exit");
			
			int ch = sc.nextInt();
			
			
			
			switch(ch)
			{
			case 1: li.addBook();
					break;
			case 2: li.removeBook();;
					break;
			case 3: li.searchBook();;
					break;
			case 4: li.displayBook();;
					break;	
			case 5: li.updateBook();;
					break;
			case 6: li.sortBook();;
					break;
			case 7: System.exit(0);
		
			}
		}

	}

}
