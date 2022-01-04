import java.util.*;
class Saddle 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rows");
		int r =sc.nextInt();
		System.out.println("Enter the columns");
		int c = sc.nextInt();
		int a[][] =new int[r][c];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.println("Enter the values");
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("Before finding saddle point");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
		int min=0,max=0,f=0;
		int p=0;
		for(int i=0;i<r;i++)
		{
			min=a[i][0];
			for(int j=0;j<c;j++)
			{
				if(a[i][j]<min)
				{
					min=a[i][j];
					p=j;
				}
			}
			max =a[0][p];
			for(int k=0;k<c;k++)
			{
				if(a[k][p]>max)
				{
					max=a[k][p];
				}
			}
			if(min==max)
			{
				f=1;
				break;
			}
		}
		if(f==1)
		{
			System.out.println("Saddle point is "+max);
		}
		else 
		{
			System.out.println("No saddle point is present ");
		}
	}
}
