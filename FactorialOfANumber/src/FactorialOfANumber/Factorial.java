package FactorialOfANumber;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter integer");
		int n=scan.nextInt();
		calculatefactorial(n);
	}
	public static void calculatefactorial(int n)
	{
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
			
		}
		System.out.println(fact);
	}

}
