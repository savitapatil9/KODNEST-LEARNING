package JavaPatternProgrammingLevel4;

public class Pattern27 {
	public static void main(String[] args) 
	{
		for(int i=0;i<=11;i++)
		{
			for(int j=0;j<=11;j++)
			{
				if(i==11/2||j==11/2)
				{
				System.out.print("* ");
				}
				else
				{
				System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
