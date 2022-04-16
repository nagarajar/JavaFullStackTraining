package jsp.cfl.collection;

import java.util.Comparator;

public class Student implements Comparator<Student>
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
	
	public String toString()
	{
		return name+"\t\t"+id+"\t\t"+marks;
	}
	@Override
	public int compare(Student b1, Student b2)
	{
		//return ((Integer)b1.id).compareTo(b2.id); // ASC order based on id
		//return ((Integer)b2.id).compareTo(b1.id); // DSC order based on id
		
		//return ((Double)b1.marks).compareTo(b2.marks); // ASC order based on marks
		//return ((Double)b2.marks).compareTo(b1.marks); // DSC order based on marks
		
		//return b1.name.compareTo(b2.name); // ASC order based on name
		return b2.name.compareTo(b1.name); // DSC order based on name
	}
	
	@Override
	public int hashCode()
	{
		return id;
	}
	@Override
	public boolean equals(Object obj)
	{
		return this.id == ((Student)obj).id;
	}
	
}
