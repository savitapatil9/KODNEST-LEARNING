package practice;

import java.util.Scanner;

public class classwork1 {
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("name");
		String a=scan.next();
		System.out.println("enter year of birth");
		int year=scan.nextInt();
		greet(a);
		int res=agecaltn(year);
		System.out.println("you are "+res+" year old");
		
	}
	public static void greet(String m) 
	{
		//Scanner scan=new Scanner(System.in);
		//string a=scan.next();
		System.out.println("Hello "+m+"...How are you..");
	}
	public static int agecaltn(int dob) {
		return 2023-dob;
		
	}

}
