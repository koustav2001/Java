import java.util.*;
import Number.Prime;
class Number_Range
{
	public static void main(String args[])
	{
	  Scanner sc=new Scanner(System.in);
	  System.out.print("Enter the lower limit : ");
	  int l=sc.nextInt();
	  System.out.print("Enter the Upper limit : ");
	  int u=sc.nextInt();
	  if(l>u)
	  {
		  System.out.println("Invalid Range ");
	  }
	  else
	  {
		  Prime P1=new Prime(); // creation of object
		  for(int k=l;k<=u;k++)
		  {
			if(P1.isPrime(k)==true)
				System.out.println(k);
		  }
	  }
	}
}