import java.util.*;
class PrimeFill
{
	public static boolean isPrime(int n)
	{
		int sq=(int)Math.sqrt(n);
		int c=0;//  initialize
		for(int i=1;i<=sq;i++)
		{
			if(n%i==0)
				 c++;
		}
		if(c==1)
			return true;
		else
			return false;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number of Rows : ");
		int m=sc.nextInt();
		System.out.print("Enter Number of Columns : ");
		int n=sc.nextInt();
		
		int a[][]=new int[m][n];
		int num=2;
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;)
			{
				if(isPrime(num)==true)
					a[i][j++]=num;
				
			   num++;
			}
		}
		System.out.println("Matrix Form ");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
				 System.out.print(a[i][j]+"\t");
			System.out.println();
		}
	}
}
