package practice.compitative.coding;

import java.util.*;
public class AmazonQ1 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("N = ");
		String x = sc.nextLine();
		int n = Integer.parseInt(x);
		
		System.out.print("Array = ");
		String s = sc.nextLine();
		String[] sArr = s.split(" ");
		ArrayList<Integer> iArr = new ArrayList<>();
		for(int i=0;i<sArr.length;i++)
		{
			String a = sArr[i];
			int b = Integer.parseInt(a);
			iArr.add(b);
		}
		int out = outPut(n,iArr);
		System.out.println(out);
	}
	public static int outPut(int n, ArrayList<Integer> iArr)
	{
		int sum = 0;
		for(int i = 1;i<=n;i++)
		{
			int gsd =0 ;
			for(int j=0;j<1;j++)
			{
				 gsd = findGCD(iArr.get(j+1),iArr.get(j+3));
			}
			int m = gsd*i;
			sum=+m;
			i++;
			for(int j=0;j<1;j++)
			{
				 gsd = findGCD(iArr.get(j),iArr.get(j+2));
			}
			int o = gsd*i;
			sum=sum+o;
			
		}
		return sum;
	}
	public static int findGCD(int a,int b)
	{
		if(a%b == 0)
			return b;
		else 
			return findGCD(b,a%b);
		
	}
			
}
