package ElseifLadder;
import java.util.Scanner;

public class Demo {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter marks");
	int marks=scan.nextInt();
	Grade g1=new Grade();
	g1.Score(marks);
}
}
