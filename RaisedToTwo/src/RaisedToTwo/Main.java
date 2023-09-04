package RaisedToTwo;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter integer");
		int n=scan.nextInt();
		CheckingRaisedToTwo r1=new CheckingRaisedToTwo();
		r1.raisedtoTwo(n);
	}

}
