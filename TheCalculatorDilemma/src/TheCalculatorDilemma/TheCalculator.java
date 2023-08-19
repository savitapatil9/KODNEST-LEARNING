package TheCalculatorDilemma;
import java.util.Scanner;

public class TheCalculator {

	public static void main(String[] args) {
		calci();
	}
		
		public static void calci()
		{
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter any oparation(symbol) you want perform ");
			String symbol=scan.next();
			System.out.println("enter two numbers");
			int a=scan.nextInt();
			int b=scan.nextInt();
		switch(symbol)
		{
		case "+":
			System.out.println("Addition is "+(a+b));
			break;
		case "-":
			System.out.println("Subtraction is "+(a-b));
			break;
		case "*":
			System.out.println("Multiplication of a and b is "+(a*b));
			break;
		case "/":
			System.out.println("Division result is "+(a/b));
			break;
		case "%":
			System.out.println("mod is "+(a%b));
			break;
		default:
			System.out.println("please enter the valid symbol to perform operation");
		
		}
		}
}
