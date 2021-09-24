import java.util.*;
abstract class Interest
{
	double p,t;
	void getdata()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the principal ");
		p=sc.nextDouble();
		System.out.print("Enter time ");
		t=sc.nextDouble();
	}
	abstract void assignRate();
}
class SBI extends Interest
{
	double r;
	void assignRate()
	{
		r=7.25;
	}
	void show()
	{
		double si=(p*r*t)/100;
		System.out.println("simple interest "+si);
	}
}
class Bandhan extends Interest
{
	double r;
	void assignRate()
	{
		r=8.5;
	}
	void show()
	{
		double si=(p*r*t)/100;
		System.out.println("simple interest "+si);
	}
}
public class Practice
{
	public static void main(String args[])
	{
		SBI ob=new SBI();
		ob.getdata();
		ob.assignRate();
		ob.show();
		
		Bandhan ob2=new Bandhan();
		ob2.getdata();
		ob2.assignRate();
		ob2.show();
	}
}