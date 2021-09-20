//single inheritance
import java.util.*;
class Employee
{
	private String name;
	private double ms;
	
	void getData()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter name : ");
		name=sc.nextLine();
		System.out.print("Enter Monthly Salary : ");
		ms=sc.nextDouble();
	}
	
	void putData()
	{
		System.out.println("Name of the employee : "+name);
		System.out.println("Monthly salary : "+ms);
	}
	
	double getSal()
	{
		return ms;
	}
}// end of employee class
class Salary extends Employee
{
	private double as;
	void cal()
	{
		as=getSal()*12;
	}
	void putData()
	{
		super.putData(); //base class function
		System.out.println("Annual salary : "+as);
	}
}
public class Employeemain
{
	public static void main(String args[])
	{
		Salary ob=new Salary();
		ob.getData();
		ob.cal();
		ob.putData();
		
	}
}