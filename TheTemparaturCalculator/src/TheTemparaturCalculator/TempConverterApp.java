package TheTemparaturCalculator;

import java.util.Scanner;

public class TempConverterApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter temp in farhnhit");
		double f=scan.nextDouble();
		TempConverter tempConverter=new TempConverter();
		double celcius=tempConverter.convertFahrenheitToCelsius(f);
		System.out.println(celcius);
	}

}
