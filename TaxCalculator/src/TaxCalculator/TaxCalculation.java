package TaxCalculator;

import java.util.Scanner;

public class TaxCalculation {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter purchase_amount:");
		double purchase_amount=scan.nextDouble();
		System.out.println("Enter tax_rate(in decimal form): ");
		double tax_rate=scan.nextDouble();
		double res=calculateTotalWithTax(tax_rate,purchase_amount);
		System.out.println("Total cost including tax: "+res);
	}
	public static double calculateTotalWithTax(double tax_rate,double purchase_amount)
	{
		return  ((purchase_amount * tax_rate)+purchase_amount);
	}

}
