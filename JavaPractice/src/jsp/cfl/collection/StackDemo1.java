package jsp.cfl.collection;
import java.util.*;
public class StackDemo1 {

	public static void main(String[] args) 
	{
		//There are 4 class specific methods in stack
		Stack<Integer> s = new Stack<Integer>();
		
		s.push(10);// 1. push() - to add values
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		System.out.println(s.size());
		System.out.println(s.isEmpty());
		System.out.println(s);
		
		System.out.println(s.search(10));// 2. search() - to get offset position of the give value, if present it return any value
		
		System.out.println(s.search(30));
		
		System.out.println(s.search(100)); // if not present return -1
		System.out.println(s.pop());// 3. pop() - it gives top most value in stack then it will remove that value
		System.out.println(s);
		System.out.println(s.peek());// 4. peek() - it gives top most value in stack
		
		

	}

}
