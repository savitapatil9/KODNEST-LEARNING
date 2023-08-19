package TemparatureConversionTool;
import java.util.Scanner;

public class TheTemparaturCovertionTool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Temparature Conversion Tool");
		Scanner scan=new Scanner(System.in);
		System.out.println("Select an Option:");
		System.out.println("1. Convert Celsius to Fahrenheit\r\n"
				+ "2. Convert Fahrenheit to Celsius");
		System.out.println("Enter Your Choice");
		int choice=scan.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("Enter Temparature in celsius");
			double celsius=scan.nextDouble();
			double Res1=celsiusToFahrenheit( celsius);
			System.out.println("The converted Temparature from celsius to Fahrenheit is "+Res1+"C");
			break;
		case 2:
			System.out.println("Enter Temparature in Fahrenheit");
			double Fahrenheit=scan.nextDouble();
			double Res2=fahrenheitToCelsius(Fahrenheit );
			System.out.println("The converted Temparature from Fahrenheit to celsius is "+Res2+"F");
			break;
		default:
			System.out.println("Enter either 1 or 2");
		}

	}
	public static double celsiusToFahrenheit(double celsius)
	{
		return ((celsius*9/5)+32);
	}
	public static double fahrenheitToCelsius(double Fahrenheit )
	{
		return ((Fahrenheit - 32)*5/9);
	}

}
