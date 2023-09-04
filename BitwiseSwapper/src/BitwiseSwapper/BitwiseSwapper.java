package BitwiseSwapper;

import java.util.Scanner;

public class BitwiseSwapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter first number");
		int first=scan.nextInt();
		System.out.println("Enter second number");
		int second=scan.nextInt();
		swapUsingBitwise(first,second);
		
		

	}
	public static int swapUsingBitwise(int x,int y)
	{
		int z=x^y;
		x=z^x;
		y=z^y;
		System.out.println("After swapping:first="+x+"second="+y);
		return 0;
	}

}
