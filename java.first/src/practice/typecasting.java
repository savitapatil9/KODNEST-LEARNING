package practice;

import java.util.Scanner;

public class typecasting 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		String a=scan.next();
		greet(a);
	}
	public static void greet(String m) 
	{
		//Scanner scan=new Scanner(System.in);
		//string a=scan.next();
		System.out.println("Hello "+m+"...How are you..");
	}

}
