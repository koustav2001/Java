import java.util.*;
class Matrix
{
	int a[][];
	int r,c;
	Matrix(int rr, int cc)
	{
		r=rr;
		c=cc;
		a=new int[r][c];
	}
	void fill()
	{
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print("Enter Number : ");
				a[i][j]=sc.nextInt();
			}
		}
	}
	void show()
	{
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
	}
	
	Matrix transpose()
	{
		Matrix T = new Matrix(c,r);
		int i,j;
		for(i=0;i<c;i++)
		{
		for(j=0;j<r;j++)
		{
			T.a[i][j] = this.a[j][i];
		}
		if(j==r-1)
		System.out.println();
		}
	return T;
	}	
		 
}
public class MatCheck
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Rows : ");
		int r=sc.nextInt();
		System.out.print("Enter Columns : ");
		int c=sc.nextInt();
		
		Matrix M1=new Matrix(r,c);
		Matrix M2=new Matrix(c,r);
	
		
		System.out.println("Details for Matrix ");
		M1.fill();
		M2=M1.transpose();
		System.out.println("First Matrix ");
		M1.show();
		System.out.println("Second Matrix ");
		M2.show();
		
	}
}
