package practice.compitative.coding;

import java.util.Scanner;

public class CarTravellling {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
				Scanner sc = new Scanner(System.in);
				int r1 = sc.nextInt();
				int n = sc.nextInt();
				int r2 = sc.nextInt();
				int k = sc.nextInt();
				
				int focus,hr;
				hr = (k+59)/60;
				System.out.println(hr);
				
				
				if(hr > n)
				{
					focus = n*r1 + (hr-n)*r2;
				}
				else
				{
					focus = n*r1;
				}
				System.out.println(focus);

	}

}
