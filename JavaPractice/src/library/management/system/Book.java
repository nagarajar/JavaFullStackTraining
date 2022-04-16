package library.management.system;

import java.util.*;

public class Book implements Comparator<Book>
{
	//Java Bean Class of Book
	private String name;
	private int id;
	private String author;
	
	public Book()
	{
		
	}
	public Book(int id, String name,String author)
	{
		this.id = id;
		this.name = name;
		this.author = author;
	}
	
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getAuthor()
	{
		return author;
	}
	public void setAuthor(String author)
	{
		this.author = author;
	}
	
	@Override
	public String toString()
	{
		return id+"\t\t"+name+"\t\t"+author;
	}
	@Override
	public int compare(Book b1, Book b2)
	{
		return ((Integer)b1.id).compareTo(b2.id);
	}
	
}
