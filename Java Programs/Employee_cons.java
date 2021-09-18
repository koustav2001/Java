//Example of constructor overloading -Parameterized Constructor
import java.util.*;
class Employee_cons
{
	private String name;
	private double ms,as;
	Employee_cons()
	{
		name="Arnab";
		ms=12000;
	}
	Employee_cons(String n, double m)
	{
		name=n;
		ms=m;
	}
	void calculate()
	{
		as=ms*12;
	}
	void print()
	{
		System.out.println("Name "+name);
		System.out.println("Monthly Salary "+ms);
		System.out.println("Annual Salary  "+as);
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the name : ");
		String n=sc.next();
		System.out.print("Enter monthly salary ");
		double m=sc.nextDouble();
		
		Employee_cons ob1=new Employee_cons(); // constructor 1
		Employee_cons ob2=new Employee_cons(n,m); // constructor 2
		
		ob1.calculate();
		ob2.calculate();
		ob1.print();
		ob2.print();
	}
	
}