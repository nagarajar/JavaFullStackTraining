package emailapp;

public class Email
{
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String department;
	private static int mailBoxCapacity = 500;
	private String alternateEmail;
	
	// Constructor to get first and last names
	public Email(String firstName, String lastName,String department,String email, String password)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;
		this.email = email;
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getMailBoxCapacity() {
		return mailBoxCapacity;
	}

	public void setMailBoxCapacity(int mailBoxCapacity) {
		this.mailBoxCapacity = mailBoxCapacity;
	}

	public String getAlternateEmail() {
		return alternateEmail;
	}

	public void setAlternateEmail(String alternateEmail) {
		this.alternateEmail = alternateEmail;
	}
	
	@Override
	public String toString()
	{
		return firstName+"\t\t"+lastName+"\t\t"+email+"\t\t"+password+"\t\t"+mailBoxCapacity;
	}
	
	

}
