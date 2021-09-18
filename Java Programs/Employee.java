import java.util.*;
class Employee
{
	private String name;
	private double ms,as;
	Employee()
	{
		name="Arnab";
		ms=12000;
	}
	void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the name : ");
		name=sc.next();
		System.out.print("Enter monthly salary ");
		ms=sc.nextDouble();
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
		Employee ob1=new Employee(); // name="Arnab" ms=12000 as=144000
		Employee ob2=new Employee(); // name="Atanu" ms=35000 as=420000
		ob2.accept();
		ob1.calculate();
		ob2.calculate();
		ob1.print();
		ob2.print();
	}
	
}