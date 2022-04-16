package practice.compitative.coding;

import java.util.*;

public class ArrayInputFromUser 
{
	public static void main(String[] args)
	{
		System.out.println("How to take array input from user");
		
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int[] arr = new int[size];
		
		for(int i =0; i<size;i++)
		{
			System.out.println("Enter element");
			arr[i] = in.nextInt();
		}
		
		System.out.println("Print array values");
		System.out.print("[ ");
		
		for(int i = 0;i<arr.length;i++)
		{
			System.out.print(arr[i]+", ");
		}
		System.out.print("]");
		
		
	}
}
