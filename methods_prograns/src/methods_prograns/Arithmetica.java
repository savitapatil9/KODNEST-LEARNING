package methods_prograns;

import java.util.Scanner;

public class Arithmetica 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter 2 numbs");
		long num1=scan.nextLong();
		long num2=scan.nextLong();
		long res=gala(num1,num2);
		System.err.println(res);
	}
	public static long gala(long num1,long num2)
	{
		long res1;
		res1=num1+num2;
		return res1;
	
	}
		
		
	}
