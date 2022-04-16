package practice.compitative.coding;

import java.util.*;
public class FindGCD 
{
	public static void main(String[] args)
	{
		System.out.println("Enter two numbers");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int gcd = findGCD(a,b);
		System.out.println("GCD = "+gcd);
		// GCD*LCM = a*b 
		// LCM = (a*b)/ GCD
		int lcm = (a*b)/gcd;
		System.out.println("LCM = "+lcm);
	}
	public static int findGCD(int a,int b)
	{
		if(a%b == 0)
			return b;
		else
			return findGCD(b,a%b);
	}
	
}
