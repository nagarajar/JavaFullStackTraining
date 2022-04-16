package practice.compitative.coding;
import java.util.*;
public class Niven {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int r, sum, num;
		sum = 0;
		num = n;
		while (n > 0)
		{
			r = n % 10;
			sum = sum + r;
			n = n / 10;
		}
		System.out.println("Sum of "+num+ " is "+sum);
		
		if(num % sum == 0)
		{
			for(int i = 0; i <= 10; i++)
			{
				if((sum * i) == num)
				{
					System.out.println(i);
					break;
				}
			}
		}
		else
		{
			System.out.println("0");	
		}
		

	}

}
