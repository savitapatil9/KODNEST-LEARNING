package PalindromeNumber;

import java.util.Scanner;

public class PalindromeOfNumber {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter integer");
		int n=scan.nextInt();
		CheckingPalindrome c=new CheckingPalindrome();
		boolean res=c.palindrome(n);
		if(res==true)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("Not palindrome");
		}
	}

}
