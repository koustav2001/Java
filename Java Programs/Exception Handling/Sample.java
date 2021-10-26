//With Exception Handling

import java.util.*;
class Sample
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two numbers : ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		try
		{
		  int d=a/b;
		  System.out.println("Result : "+d);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("Thank You ");
	}
}
