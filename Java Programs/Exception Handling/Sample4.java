/*
Java finally block is a block used to 
execute important code such as closing the connection, etc.

Java finally block is always executed whether an exception is 
handled or not. Therefore, it contains all the necessary statements 
that need to be printed regardless of the exception occurs or not.
*/

import java.util.*;
class Sample4
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]={2,4,6,8};// array declare
		System.out.println("Enter the Number : ");
		String s=sc.next();
		System.out.println("Enter the index value : ");
		int ind=sc.nextInt();
		try
		{
			int num=Integer.parseInt(s);
			System.out.println("Number : "+num);
			System.out.println("Element of index value "+ind+" is: "+a[ind]);
		}
		catch(ArrayIndexOutOfBoundsException ob)
		{
			System.out.println("Invalid Index ");
		}
		catch(NumberFormatException ob)
		{
			System.out.println("Enter non numeric character ");
		}
		finally
		{
			System.out.println("Sample Program ");
		}
		System.out.println("Thank You ");
	}
}