package jsp.cfl.assignments;
import java.util.*;
public class Student //implements Comparator<Student>
{
	private String name;
	private int id;
	private double marks;
	public Student()
	{
		
	}
	public Student(String name, int id, double marks)
	{
		this.name = name;
		this.id = id;
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	
	@Override
	public String toString()
	{
		return name+"\t\t"+id+"\t\t"+marks;
	}
	
	/*@Override
	public int compare(Student s1, Student s2)
	{
		return ((Integer)s1.id).compareTo(s2.id);
	}*/
}
