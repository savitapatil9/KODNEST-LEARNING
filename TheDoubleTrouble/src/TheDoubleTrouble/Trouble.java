package TheDoubleTrouble;
import java.util.Scanner;

public class Trouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number");
		int num=scan.nextInt();
		System.out.println(doubleTheNumber(num));

	}
	public static int doubleTheNumber(int num) {
		return 2*num;
	}

}
