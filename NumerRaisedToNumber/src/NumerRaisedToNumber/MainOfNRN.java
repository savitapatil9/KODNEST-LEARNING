package NumerRaisedToNumber;

import java.util.Scanner;

public class MainOfNRN {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter integer");
		int n=scan.nextInt();
		
		NumberCounting n1=new NumberCounting();
		NumberCounting n2=new NumberCounting();
		int res=n1.countAndPower(n);
		System.out.println(res);
		long res1=n2.power(res, n);
		System.out.println(res1);

	}

}