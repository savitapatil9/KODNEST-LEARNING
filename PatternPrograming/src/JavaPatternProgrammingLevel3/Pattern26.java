package JavaPatternProgrammingLevel3;

public class Pattern26 {
	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print(" ");
				
			}
			for(int k=5;k>=i;k--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=2;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print(" ");
				
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
