//ArrayIndexOutOfBoundsException-Method for taking any exception if the index is not valid in array data structures
//NumberFormatException-Exception happens when we try to convert string to number
import java.util.*;
class Sample3
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
		System.out.println("Thank You ");
	}
}