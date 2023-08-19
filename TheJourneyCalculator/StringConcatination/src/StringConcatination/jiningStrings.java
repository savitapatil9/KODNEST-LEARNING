package StringConcatination;

import java.util.Scanner;

public class jiningStrings {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter two strings");
	String str1=scan.next();
	String str2=scan.next();
	System.out.println(join(str1,str2));
}
public static String join(String str1,String str2)
{
	return str1+str2;
}
}
