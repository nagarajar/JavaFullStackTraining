package emailapp;
import java.util.*;
public class EmailDataBase 
{
	private List<Email> l;
	private Scanner sc;
	private String companySuffix = "Cognizant.com";
	private Email e;
	
	public EmailDataBase(List<Email> l,Scanner sc )
	{
		this.l = l;
		this.sc = sc;  
	}
	
	public void addMail()
	{
		e = readEmailDetails();
		l.add(e);
	}
	public Email readEmailDetails()
	{
		sc.nextLine();
		System.out.println("Enter your first name");
		String fname = sc.nextLine();
		System.out.println("Enter your last name");
		String lname = sc.nextLine();
		System.out.println("Select department");
		String department = selectDepartment();
		int length = 8;
		String randomPassword = randomPassword(length);
		String email = fname.toLowerCase() +"."+ lname.toLowerCase() +"."+ department +"."+companySuffix;
		
		return new Email(fname,lname,department,email,randomPassword);
		
	}
	public String selectDepartment()
	{
		System.out.println("1. Sales\n2. Development\n3. Accounting\n4. None");
		int ch = sc.nextInt();
		if(ch == 1)
		{
			return "sales";
		}
		else if(ch == 2)
		{
			return "development";
		}
		else if(ch == 3)
		{
			return "accounting";
		}
		else
		{
			return "";
		}
	}
	public String randomPassword(int length)
	{
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234569870!@#$%^&*";
		char[] password = new char[length];
		for(int i = 0; i<length; i++)
		{
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}
	public void diplayEmail()
	{
		System.out.println("Email Details ..............!");
		for(int i=0; i< l.size(); i++)
		{
			System.out.println("----------------------------------------------------");
			System.out.println("First Name      : "+l.get(i).getFirstName());
			System.out.println("Last Name       : "+l.get(i).getLastName());
			System.out.println("Email           : "+l.get(i).getEmail());
			System.out.println("Password        : "+l.get(i).getPassword());
			System.out.println("Mail Capacity   : "+l.get(i).getMailBoxCapacity());
			System.out.println("Alternate email : "+l.get(i).getAlternateEmail());
			System.out.println("----------------------------------------------------");
			
		}
	}
	public void changePassword()
	{
		if(!l.isEmpty())
		{
			System.out.println("Enter your Email id");
			sc.nextLine();
			String email = sc.nextLine();
			
			for(int i=0; i< l.size(); i++)
			{
				if(l.get(i).getEmail().equalsIgnoreCase(email))
				{
					System.out.println("Enter New Password");
					String npass = sc.nextLine();
					System.out.println("Renter New Password");
					String rpass = sc.nextLine();
					if(npass.equals(rpass))
					{
						l.get(i).setPassword(npass);
						System.out.println("You have successfully changed your password....!");
					}
					else
					{
						System.out.println("New password and Rentered new password not matching......!");
					}
					return;
					
				}
				
			}
			System.out.println("Email Id : "+email+" not exist or you entered incorrect email id check once ....!");
		}
		else
		{
			System.out.println("The Email list is empty.............!");
		}
		
	}
	public void setEmailCapacity()
	{

		System.out.println("Enter new mail box capacity");
		
		int ebc = sc.nextInt();
		
		e.setMailBoxCapacity(ebc);
		
		System.out.println("New mail box capacity : "+e.getMailBoxCapacity());
			
		
	}
	public void alternetEmail()
	{
		if(!l.isEmpty())
		{
			System.out.println("Enter your Email id");
			sc.nextLine();
			String email = sc.nextLine();
			
			for(int i=0; i< l.size(); i++)
			{
				if((l.get(i).getEmail().equalsIgnoreCase(email)))
				{
					
					System.out.println("Enter your password");
					
					String cpass = sc.nextLine();
					if((l.get(i).getPassword().equals(cpass)))
					{
						System.out.println("Enter alternate email id");
						String aemail = sc.nextLine();
						l.get(i).setAlternateEmail(aemail);
						System.out.println("Your alternate email id : "+aemail+" added successfully....!\n Thank you.....!");	
						return;
					}
					else
					{
						System.out.println("Password is incorrect...........!");
					}
					
					
				}
				
			}
			System.out.println("Email Id : "+email+" not exist or you entered incorrect email id check once ....!");
		}
		else
		{
			System.out.println("The Email list is empty.............!");
		}
	}
}
	// Ask for department

	// Generate random password
	
	// Set mail box capacity
	
	// Set alternate email
	
	// Change the password
	
	