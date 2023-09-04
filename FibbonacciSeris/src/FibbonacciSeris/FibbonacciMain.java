package FibbonacciSeris;

import java.util.Scanner;

public class FibbonacciMain 
{
public static void main(String[] args)
{
	Scanner scan=new Scanner(System.in);
	System.out.println("enter integer");
	int n=scan.nextInt();
	printFibonacciSeries(n);
}
public static void printFibonacciSeries(int n)
{
	int fib1=0;
	int fib2=1;
	if(n==1)
	{
		System.out.println(0+" "+1+" ");
	}
	else
	{

	
	System.out.print(fib1+" "+fib2+" ");
	for(int i=1;i<=n-2;i++)
	{
	int fib3=fib1+fib2;
	System.out.print(fib3+" ");
	fib1=fib2;
	fib2=fib3;
	}
	}
	
	}
} 

