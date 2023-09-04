package NumberTablePrinter;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter integer");
		int n=scan.nextInt();
		printTable(n);
			
	}
	public static void printTable(int num)
	{
		int prod=1;
		for(int i=1;i<=10;i++)
		{
			prod=num*i;
			System.out.println(num+"X"+i+"="+prod);
			
		}
	// your code here
	}
}
