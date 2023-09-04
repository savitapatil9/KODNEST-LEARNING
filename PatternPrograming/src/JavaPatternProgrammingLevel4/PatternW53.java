package JavaPatternProgrammingLevel4;

public class PatternW53 {
	public static void main(String[] args) 
	{
		int n=10;
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=n;j++)
			{
				if(j==i&&i>=n/2||j==n-i-1&&i>=n/2||j==0||j==n)
				{
				System.out.print("*");
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
