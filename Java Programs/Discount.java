import java.util.*;
class Discount
{
	private static int cost;
	private String name;
	private double dc,amt;
	
	void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the cost of the article : ");
		cost=sc.nextInt();
		System.out.print("Enter the customer name ");
		name=sc.next();
	}
	
	void cal()
	{
		if(cost<=5000)
			dc=0.0;
		else if(cost>5000 && cost<=10000)
			dc=cost*0.1;
		else if(cost>10000 && cost<=15000)
			dc=cost*0.15;
		else
			dc=cost*0.2;
		
		amt=cost-dc;
	}
	
	void display()
	{
		System.out.println("name of the customer "+name);
		System.out.println("Cost of article "+cost);
		System.out.println("Discount "+dc);
		System.out.println("Amount to be paid "+amt);
	}
}
class Dismain
{
	
	public static void main(String args[])
	{
		Discount D=new Discount(); //creation of object
		D.input();
		D.cal();
		D.display();
	}
}