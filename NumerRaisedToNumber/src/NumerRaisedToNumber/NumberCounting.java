package NumerRaisedToNumber;

public class NumberCounting 
{
int countAndPower(int n)
{
	
	int count=0;
	while(n>0)
	{
		n=n/10;
		count++;
		
	}
	return count;
}
long power(int res,int n)
{
	long fr=1;
	for(int i=1;i<=res;i++)
	{
		fr=fr*n;
	}
	return fr;
}
}
