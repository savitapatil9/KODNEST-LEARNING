package TheGadeCheck;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		checkGrade(num);
		
	}
	public static void checkGrade(int n)
	{
	// your code here
		if(n>=50)
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
	}
}
