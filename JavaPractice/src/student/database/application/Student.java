package student.database.application;

public class Student 
{
	private String firstName;
	private String lastName;
	private String studentId;
	private int gradeLevel;
	private int year;
	private String courseEnroll;
	private double balance = 0;
	private double tuitionFees = 0;
	private double courseCost = 600;
	
	public Student(String firstName,String lastName,int year,int gradeLevel,String studentId,String courseEnroll, 
			double balance,double tuitionFees )
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.year = year;
		this.studentId = studentId;
		this.courseEnroll = courseEnroll;
		this.balance = balance;
		this.tuitionFees = tuitionFees;
	}
	
	public String getFirstName()
	{
		return firstName;
	}
	
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public int getGradeLevel() {
		return gradeLevel;
	}

	public void setGradeLevel(int gradeLevel) {
		this.gradeLevel = gradeLevel;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getCourseEnroll() {
		return courseEnroll;
	}

	public void setCourseEnroll(String courseEnroll) {
		this.courseEnroll = courseEnroll;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getTuitionFees() {
		return tuitionFees;
	}

	public void setTuitionFees(double tuitionFees) {
		this.tuitionFees = tuitionFees;
	}

	public double getCourseCost() {
		return courseCost;
	}

	public void setCourseCost(double courseCost) {
		this.courseCost = courseCost;
	}
	
	@Override
	public String toString()
	{
		return "Name             : "+firstName+" "+lastName+"\n"+
			   "ID               : "+studentId+"\n"+
			   "Courses Enrolled : "+courseEnroll+"\n"+
			   "Tuition Fees     : $"+tuitionFees+"\n"+
			   "Balance          : $"+balance;
			   
	}
	
}
