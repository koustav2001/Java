import java.util.*;
class Bank
{
	double p;
	Bank()
	{
		p=5000;
	}
	void deposit()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the deposit amount : ");
		double d=sc.nextDouble();
		p=p+d;
	}
	void withdraw()throws FundException
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the withdrawn amount : ");
		double w=sc.nextDouble();
		if(w<=p)
			p=p-w;
		else
			throw new FundException(w-p);// call 
	}
	void show()
	{
		System.out.println("Available balance : "+p);
	}
	
}
