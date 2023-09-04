package BitwiseBitCounter;

import java.util.Scanner;

class BitwiseBitCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter an integer");
		int x=scan.nextInt();
		System.out.println("Number of set bits: "+countSetBits(x));
	
		

	}
	public static int countSetBits(int x)
	{
		int count=0;
		while(x>0)
		{
			count+=x&1;
			x>>=1;
		}
		return count;
	}

}
