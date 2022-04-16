package emailapp;
import java.util.*;
public class EmailApp 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		EmailDataBase edb = new EmailDataBase(new ArrayList<Email>(), sc);
		
		System.out.println("Welcome to Email App.......!");
		while(true)
		{
			System.out.println("Choose below options as per your wish.......!");
			System.out.println("1. Add New Email\n2. Diplay Mail Info\n3. Change Password \n4. Set Mail Capacity\n5. Define Alternate Email\n6. Exit");
			
			int ch = sc.nextInt();
			
			switch(ch)
			{
				case 1:edb.addMail();
					break;
				case 2:edb.diplayEmail();
					break;
				case 3:edb.changePassword();
					break;
				case 4:edb.setEmailCapacity();
					break;
				case 5:edb.alternetEmail();
					break;
				case 6:System.exit(0);
			}
		}

	}

}
