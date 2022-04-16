package library.management.system;

import java.util.*;

import student.management.system.practice.Student;

public class LibraryInformation 
{
	private List<Book> l;
	private Scanner sc;
	
	public LibraryInformation(List<Book> l,Scanner sc)
	{
		this.l = l;
		this.sc = sc;
	}
	
	public void addBook()
	{
		Book b = readBookDetails();
		l.add(b);
	}
	public Book readBookDetails()
	{
		System.out.println("Enter Book Id");
		int id = sc.nextInt();
		
		sc.nextLine();
		System.out.println("Enter Book Name");
		String name = sc.nextLine();
		
		System.out.println("Enter Book Author");
		String author = sc.nextLine();
		
		return new Book(id,name,author);
		
	}
	public void removeBook()
	{
		if(!l.isEmpty())
		{
			System.out.println("Enter the id of the book to remove");
			int id = sc.nextInt();
			for(int i = 0; i<l.size(); i++)
			{
				if(l.get(i).getId() == id)
				{
					l.remove(i);
					System.out.println("************ Book List After Removing ************");
					displayBook();
					return;
				}
			}
			System.out.println("Book with id "+id+" doesn't exist....!");
		}
		else
		{
			System.out.println("Book list is empty !! can't remove...!");
		}
	}
	public void searchBook()
	{
		if(!l.isEmpty())
		{
			System.out.println("What you want to search...\n1.Book ID \n2. Book Name\n3. Book Author");
			int ch = sc.nextInt();
			
			if(ch == 1)
			{
				searchById();
			}
			else if(ch == 2)
			{
				searchByName();
			}
			else if(ch == 3)
			{
				searchByAuthor();
			}
			else
			{
				System.out.println("Invalid selection....!");
			}

			
		}
		else
		{
			System.out.println("Book list is empty !! can't remove...!");
		}
	}
	public void searchById()
	{
		System.out.println("Enter the id of the book to search");
		int id = sc.nextInt();
		for(int i = 0; i<l.size(); i++)
		{
			if(l.get(i).getId() == id)
			{
			
				System.out.println("Book with id "+id+" exist....!");
				System.out.println("ID\t\tName\t\tAuthor");
				System.out.println("-------------------------------------------------------");
				System.out.println(l.get(i));
				return;
			}
		}
		System.out.println("Book with id "+id+" doesn't exist....!");
	}
	public void searchByName()
	{
		System.out.println("Enter the name of the book to search");
		sc.nextLine();
		String name = sc.nextLine();
		for(int i = 0; i<l.size(); i++)
		{
			if(l.get(i).getName().equalsIgnoreCase(name))
			{
			
				System.out.println("Book with book name "+name+" exist....!");
				System.out.println("ID\t\tName\t\tAuthor");
				System.out.println("-------------------------------------------------------");
				System.out.println(l.get(i));
				return;
			}
		}
		System.out.println("Book with name "+name+" doesn't exist....!");
	}
	public void searchByAuthor()
	{
		System.out.println("Enter the author name of the book to search");
		sc.nextLine();
		String author = sc.nextLine();
		for(int i = 0; i<l.size(); i++)
		{
			if(l.get(i).getAuthor().equalsIgnoreCase(author))
			{
			
				System.out.println("Book with author name  "+author+" exist....!");
				System.out.println("ID\t\tName\t\tAuthor");
				System.out.println("-------------------------------------------------------");
				System.out.println(l.get(i));
				return;
			}
		}
		System.out.println("Book with author name "+author+" doesn't exist....!");
	}
	public void displayBook()
	{
		System.out.println("ID\t\tName\t\tAuthor");
		System.out.println("-------------------------------------------------------");
		for(int i = 0; i<l.size(); i++)
		{
			System.out.println(l.get(i));
		}
	}
	public void updateBook()
	{
		if(!l.isEmpty())
		{
			System.out.println("What you want to update...\n1. Book Name\n2. Book Author");
			int ch = sc.nextInt();
			
			if(ch == 1)
			{
				updateBookName();
			}
			else if(ch == 2)
			{
				updateBookAuthor();
			}
			else
			{
				System.out.println("Invalid selection....!");
			}

			
		}
		else
		{
			System.out.println("Book list is empty !! can't update...!");
		}
	}
	public void updateBookName()
	{
		System.out.println("Enter the id of the book to update Book name");
		int id = sc.nextInt();
		for(int i = 0; i<l.size(); i++)
		{
			if(l.get(i).getId() == id)
			{
			
				System.out.println("Book with id "+id+" exist....!");
				System.out.println("Enter the new name of book");
				sc.nextLine();
				String nname = sc.nextLine();
				l.get(i).setName(nname);
				System.out.println("********* Book List After Updating *********");
				displayBook();
				return;
			}
		}
		System.out.println("Book with id "+id+" doesn't exist....!");
	}
	
	public void updateBookAuthor()
	{
		System.out.println("Enter the id of the book to update Book author name");
		int id = sc.nextInt();
		for(int i = 0; i<l.size(); i++)
		{
			if(l.get(i).getId() == id)
			{
			
				System.out.println("Book with id "+id+" exist....!");
				System.out.println("Enter the new author name of book");
				sc.nextLine();
				String nAuthor = sc.nextLine();
				l.get(i).setAuthor(nAuthor);
				System.out.println("********* Book List After Updating *********");
				displayBook();
				return;
			}
		}
		System.out.println("Book with id "+id+" doesn't exist....!");
	}
	
	public void sortBook()
	{
		if(!l.isEmpty())
		{
			Collections.sort(l, new Book());
			System.out.println("*************** Book list after sorting based on ID ***************");
			displayBook();
			return;
			
		}
		else
		{
			System.out.println("The list is empty, we can't perform remove operation ....!");
		}
		
	
	}

}
		/*public void sortBook()
		{
			
			if(!l.isEmpty())
			{
				//System.out.println("Sort book list based on...!\n1. Book ID\n2.Book Name\n3. Book Anuthor Name");
				System.out.println("Sort book list based on...!\n1. Book ID\n2.Book Name\n3. Book Anuthor Name");
				int ch = sc.nextInt();
				
				if(ch == 1)
				{
					sortById();
				}
				else if(ch == 2)
				{
					sortByName();
				}
				else if(ch == 3)
				{
					sortByAuthor();
				}
				else
				{
					System.out.println("Invalid selection....!");
				}
		
				
			}
			else
			{
				System.out.println("Book list is empty !! can't sort...!");
			}
			
		}
		public void sortById()
		{
			System.out.println("In which order.....!\n1. ASC\n2.DSC");
			int ch = sc.nextInt();
			if(ch == 1)
			{
				Collections.sort(l, new Book());
			}
		}
		public void sortByName()
		{
			
		}
		public void sortByAuthor()
		{
			
		}*/
