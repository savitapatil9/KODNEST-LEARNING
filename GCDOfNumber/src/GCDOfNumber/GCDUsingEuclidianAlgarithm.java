package GCDOfNumber;

import java.util.Scanner;

public class GCDUsingEuclidianAlgarithm {
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
		while(b>0)
		{
		int r=a%b;
		a=b;
		b=r;
		}
		System.out.println(a);
		
	
	}

}
