package PrimeNumberPrinter;

import java.util.Scanner;

public class PimeNumber {
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter integer");
		int n=scan.nextInt();
		printPrimes(n);
	}
	public static void printPrimes(int n)
	{
		int count=0;
		for(int i=3;count<n;i++)
		{
		boolean res=checkPrimes(i);
		if(res==true)
		{
			System.out.println(i);
			count++;
		}
		
		}
	}
	
	public static boolean checkPrimes(int n)
	{
				for(int i=2;i<n;i++)
		{
			if(n%i==0) 
			{
				//System.out.println("not prime");
				return false;
				
			}
			
		}
		
		return true;
		
	}
	
	

}