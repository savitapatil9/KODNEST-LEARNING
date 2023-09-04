package JavaPatternProgrammingLevel5;

public class Pattern57 {
public static void main(String[] args) 
{
	int n=5;
	
	for(int i=1;i<=n;i++)
	{
		char x='A';
		for(int j=1;j<=i;j++)
		{
			System.out.print(x);
			x++;
		}
		System.out.println();
	}
	
}
}
