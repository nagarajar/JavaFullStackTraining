package jsp.cfl.collection;

import java.util.*;

public class ReverseArray {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many elements would want to store");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter  elements");
		for(int i =0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
		for(int i =0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(int i =arr.length-1;i>=(arr.length-1)/2;i--)
		{
			int temp = arr[i];
			//System.out.println("temp "+ temp);
			arr[i] = arr[(arr.length-1)-i];
			//System.out.println("arr["+i+"] = "+arr[(arr.length-1)-i]);
			
			arr[(arr.length-1)-i] = temp;
			//System.out.println("arr["+((arr.length-1)-i)+"] = "+temp);
			
		}
		System.out.println();
		for(int i =0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
