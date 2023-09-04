package TheMethodOverloadingCalculator;

import java.util.Scanner;

public class TheMethodOvrloadingCalculator {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int num1=scan.nextInt();
		System.out.println("Enter the second number: ");
		int num2=scan.nextInt();
		System.out.println("Enter the operator (+, -, *, /):");
		String oparator=scan.next();
		System.out.println("Result is: "+calculate(num1,num2,oparator));
		//System.out.println("Result is: "+calculate(num1,oparator,num2));
		//System.out.println("Result is: "+calculate(oparator,num1,num2));
		//System.out.println("Result is: "+calculate(num1,num2));
		
	}
public static int calculate(int num1,int num2,String oparator)
{
	switch(oparator) 
	{
	case "+":
		return num1+num2;
	case "-":
		return num1-num2;
	case "*":
		return num1*num2;
	case "/":
		return num1/num2;
	default:
		System.out.println("Please enter the valid oparator");
	}
	return 0;
}

public static int calculate(int num1,String oparator,int num2)
	{	
		switch(oparator) 
		{
		case "+":
			return num1+num2;
		case "-":
			return num1-num2;
		case "*":
			return num1*num2;
		case "/":
			return num1/num2;
		default:
			System.out.println("Please enter the valid oparator");
		}
		return 0;
}
public static int calculate(String oparator,int num1,int num2)
{
	switch(oparator) 
	{
	case "+":
		return num1+num2;
	case "-":
		return num1-num2;
	case "*":
		return num1*num2;
	case "/":
		return num1/num2;
	default:
		System.out.println("Please enter the valid oparator");
	}
	return 0;
}
public static int calculate(int num1,int num2)
{
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the operator (+, -, *, /):");
	String oparator=scan.next();
	switch(oparator) 
	{
	case "+":
		return num1+num2;
	case "-":
		return num1-num2;
	case "*":
		return num1*num2;
	case "/":
		return num1/num2;
	default:
		System.out.println("Please enter the valid oparator");
	}
	return 0;
}

}
