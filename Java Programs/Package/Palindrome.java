package Number;
public class Palindrome
{
	public static boolean isPalin(int n)
	{
		int cpy=n;
		int r=0;
		while(n>0)
		{
		  int d=n%10;
		  r=r*10+d;
		  n=n/10;
		}
		if(cpy==r)
			return true;
		else
			return false;
	}
}