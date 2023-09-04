package CountTheNumberOfDigitsPresentInNumber;

public class PrintgCountingNumbersOfDigitsinNumber {
	void count(int n)
	{
		int count=0;
		while(n>0)
		{
			n=n/10;
			count++;
			
		}
		System.out.println(count);
		
	}

}
