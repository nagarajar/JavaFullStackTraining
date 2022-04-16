package practice.compitative.coding;

import java.util.*;

public class ArrayInputFromUserCollection 
{
	public static void main(String[] args)
	{
		ArrayList<Integer> arr = new ArrayList<>();
		
		System.out.println("How many elements do you want add");
		
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		System.out.println("Enter array elements");
		for(int i =0; i<size;i++)
		{
			arr.add(sc.nextInt());
		}
		
		System.out.println("Print array elements");
		System.out.println(arr);
	}
}
