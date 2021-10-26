import java.util.*;
class Sample2
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number : ");
		String s=sc.next();
		try
		{
			int num=Integer.parseInt(s);
			System.out.println("Number : "+num);
		}
		catch(Exception ob)
		{
			System.out.println(ob.getMessage());
		}
		System.out.println("Thank You ");
	}
}