package jsp.cfl.collection;

public class GenericDemo1 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Test<Integer> t1 = new Test<Integer>(10);
		System.out.println(t1.getX());

		Test<String> t2 = new Test<String>("Hello");
		System.out.println(t2.getX());

		Test<Double> t3 = new Test<Double>(10.11);
		System.out.println(t3.getX());
		
		Test<Long> t4 = new Test<Long>(10000l);
		System.out.println(t4.getX());

	}

}
