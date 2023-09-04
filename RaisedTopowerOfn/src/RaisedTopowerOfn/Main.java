package RaisedTopowerOfn;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter integer");
		int n=scan.nextInt();
		CheckingRaisedToPower cr=new CheckingRaisedToPower();
		cr.powenofN(n);
	}

}
