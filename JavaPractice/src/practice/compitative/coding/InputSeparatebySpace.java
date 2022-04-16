package practice.compitative.coding;

import java.util.*;

public class InputSeparatebySpace {

	public static void main(String[] args) 
	{
		// How to separate input by space when user gave as 3 4 5 6 7 and move this into array
		System.out.println("Enter values");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] sArr = s.split(" ");
		
		ArrayList<Integer> iArr = new ArrayList<>();
		
		
		for(int i=0;i<sArr.length;i++)
		{
			String a = sArr[i];
			int b = Integer.parseInt(a);
			iArr.add(b);
		}
		System.out.println(iArr);
		

	}

}
