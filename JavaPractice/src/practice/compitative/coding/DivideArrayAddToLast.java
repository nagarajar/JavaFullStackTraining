package practice.compitative.coding;

import java.util.Scanner;

public class DivideArrayAddToLast {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++)
		{
			arr[i] = sc.nextInt();
		}
		int k = sc.nextInt();
		for(int i = k; i < n; i++)
		{
			
			System.out.print(arr[i]+" ");
			
		}
		for(int i = 0; i < k; i++)
		{
			
			System.out.print(arr[i]+" ");
			
		}
		
		

	}

}
