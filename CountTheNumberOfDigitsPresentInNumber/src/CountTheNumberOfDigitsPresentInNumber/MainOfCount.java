package CountTheNumberOfDigitsPresentInNumber;

import java.util.Scanner;

public class MainOfCount {
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter integer");
		int n=scan.nextInt();
		PrintgCountingNumbersOfDigitsinNumber c1=new PrintgCountingNumbersOfDigitsinNumber();
		c1.count(n);
		
	}

}