package GCDOfNumber;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter integer");
		int a=scan.nextInt();
		int b=scan.nextInt();
		findGCD(a,b);
	}
	public static void findGCD(int a, int b)
	{
		int gcd=1;
		for(int i=2;i<=a;)
		{
			if(a%i==0&b%i==0)
			{
				 gcd=gcd*i;
				 a=a/i;
				 b=b/i;
				 continue;
			}
			i++;
		}

			System.out.println(gcd);
		
	}

}