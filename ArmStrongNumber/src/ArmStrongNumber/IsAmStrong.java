package ArmStrongNumber;

public class IsAmStrong {
	void checkArmStrong(int n)
	{
		int fr=0;
		int org=n;
		while(n>0)
		{
			int ld=n%10;
			fr=fr+(ld*ld*ld);
			n=n/10;
		}
		if(fr==org)
		{
			System.out.println(org+" is ArmStrong number");
		}
		else
		{
			System.out.println("not armstrong");
		}
	}
	
	

}