package practice;

import java.util.Scanner;

public class greet {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter in");
		int age=scan.nextInt();
		System.out.println("vale id"+age);
		System.out.println("enter name");
		String n=scan.next();
		System.out.println("name is "+n);
		System.out.println("is marred");
		boolean s=scan.nextBoolean();
		System.out.println("value is"+s);
		System.out.println("enter height");
		float h=scan.nextFloat();
		System.out.println("height is "+h);
		System.out.println("enter branch");
		scan.nextLine();
		String f=scan.nextLine();
		System.out.println("branch is"+f);
	}

}
