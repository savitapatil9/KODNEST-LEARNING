package TheMultipleOfTenChecker;
import java.util.Scanner;


public class MultipleofTen{
	


public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		checkMultipleOfTen(num);
	}
	
	
	public static void checkMultipleOfTen(int n)
	{
	// your code here
		if(n%10==0)
		{
			System.out.println("The number is a multiple of 10.");
		}
		else
		{
			System.out.println("The number is not a multiple of 10.");
		}
	} 
}
