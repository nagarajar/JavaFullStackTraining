package jsp.cfl.assignments;

public class Mobile 
{
	private String name;
	private String color;
	private double price;
	
	public Mobile()
	{
	}
	
	public Mobile(String name,String color,double price)
	{
		this.color = color;
		this.name = name;
		this.price = price;
	}
	
	public String getColor()
	{
		return color;
	}
	public void setColor(String color)
	{
		this.color = color;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public double getPrice() 
	{
		return price;
	}

	public void setPrice(double price) 
	{
		this.price = price;
	}
	
	@Override
	public String toString()
	{
		return name+"\t\t"+color+"\t\t"+price;
	}
}
