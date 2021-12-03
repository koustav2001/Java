package Number;
public class Prime
{
	public static boolean isPrime(int n)
	{
		int f=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
				f++;
		}
		if(f==2)
			return true;
		else
			return false;
	}
}
