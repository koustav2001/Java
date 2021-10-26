/*
The Java throw keyword is used to throw an exception explicitly.

We specify the exception object which is to be thrown. 
The Exception has some message with it that provides the error 
description. These exceptions may be related to user inputs, 
server, etc.
*/

import java.util.*;
class Sample5
{
	public static void check(int a)
	{
		if(a<50)
			throw new ArithmeticException("Not a Senior Citizen");
		else
		{
			System.out.println("Welcome");
		}
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age : ");
		int a=sc.nextInt();
		try
		{
			check(a);
		}
		catch(ArithmeticException ob)
		{
			System.out.println(ob.getMessage());
		}
		System.out.println("Thank You ");
	}
}