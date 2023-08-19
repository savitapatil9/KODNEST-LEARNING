package TheJourneyCalculator;

import java.util.Scanner;

public class TheJourneyCalculatorApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("speed and time");
		double speed=scan.nextDouble();
		double time=scan.nextDouble();
		JourneyCaluculator journeyCaluculator=new JourneyCaluculator();
		System.out.println(journeyCaluculator.distance(speed,time));
		
		
	}

}
