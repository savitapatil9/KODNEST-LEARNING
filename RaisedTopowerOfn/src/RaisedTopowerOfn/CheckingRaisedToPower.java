package RaisedTopowerOfn;

public class CheckingRaisedToPower 
{
void powenofN(int n)
{
	int res=1;
	int count=n;
	while(count>0)
	{
		res=res*n;
		count--;
	
	}
	System.out.println(res);
}

}