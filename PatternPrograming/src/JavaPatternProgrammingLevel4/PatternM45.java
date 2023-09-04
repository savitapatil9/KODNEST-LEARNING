package JavaPatternProgrammingLevel4;

public class PatternM45 {
	public static void main(String[] args) 
	{
		int n=10;
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=n;j++)
			{
				if(j==10||j==0||(j==n-i-1&&i<=n/2)||(i==j&&j<=n/2))
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
