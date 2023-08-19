package TheLogicOparatorValidation;
import java.util.Scanner;

public class OparatorValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter input_is_valid in true or false");
		boolean input_is_valid=scan.nextBoolean();
		System.out.println("Enter certain_condition_valid in true or false");
		boolean certain_condition_valid=scan.nextBoolean();
		boolean res=isValidInput(input_is_valid,certain_condition_valid);
		if(res==true)
		{
		System.out.println("Input is valid");
		}
		else
		{
		System.out.println("Input is invalid");	
		}
	}
	public static boolean isValidInput(boolean input_is_valid,boolean certain_condition_valid)
	{
		return (input_is_valid&&certain_condition_valid);
	}

}
