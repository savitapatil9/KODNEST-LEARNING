package VendingMachineSimulating;
import java.util.Scanner;

public class Main {
		public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			System.out.println("enter drink");
			String p=scan.next();
			getProduct(p);	
		}
			 public static void getProduct(String productCode)
			 { 
				 switch(productCode)
				 {
				 case "p00":
					 System.out.println("Pepsi");
					 break;
				 case "p01":
					 System.out.println("Cocacola");
					 break;
				 case "p02":
					 System.out.println("Fanta");
					 break;
				 case "p03":
					 System.out.println("jaljeera");
					 break;
				 case "p04":
					 System.out.println("Mountaindue");
					 break;
				 default:
						System.out.println("Panaka");
					 
				 }
				 
				 }
			
					

		}
