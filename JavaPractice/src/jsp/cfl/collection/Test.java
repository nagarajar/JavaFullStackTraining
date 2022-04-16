package jsp.cfl.collection;

public class Test<T>
{
	private T x;
	
	public Test(T x)
	{
		this.x = x;
	}
	
	public T getX()
	{
		return x;
	}
	
	public void setX(T x)
	{
		this.x = x;
	}
}
