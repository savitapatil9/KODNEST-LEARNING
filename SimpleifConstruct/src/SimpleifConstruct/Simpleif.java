package SimpleifConstruct;
import java.util.Scanner;

public class Simpleif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("entera numbr");
		int marks=scan.nextInt();
		System.out.println("welcom to kodnext");
		ifstmt(marks);
		
	}
	public static void ifstmt( int mark)
	{
		if(mark>=80)
		{
			System.out.println("welcome to techclub");
		}
	}

}
