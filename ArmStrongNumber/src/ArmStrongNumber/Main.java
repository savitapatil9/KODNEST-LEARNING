package ArmStrongNumber;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter integer");
	    int n=scan.nextInt();
		IsAmStrong a1=new IsAmStrong();
		a1.checkArmStrong(n);
	}

}
