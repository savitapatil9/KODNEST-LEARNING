package PalindromeNumber;
public class CheckingPalindrome {
	boolean palindrome(int n)
	{
		int org=n;
		int rev=0;
		while(n>0)
		{
			int ld=n%10;
			 rev=rev*10+ld;
			 n=n/10;
		
		}
		if(org==rev)
		{
			//System.out.println("palindrome");
			return true;
		}
		else
		{
			//System.out.println(" Not palindrome");
			return false;
		}
	}

}
