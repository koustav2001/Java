import java.util.*;
class Bankmain
{
	public static void main(String args[])throws FundException
	{
		Bank B=new Bank(); // creation ob object
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("1 for Deposit ");
			System.out.println("2 for withdrawn ");
			System.out.println("3 for View Balance ");
			System.out.println("4 for Exit ");
			System.out.print("Enter choice :");
			int ch=sc.nextInt();
			
			switch(ch)
			{
				case 1:
				B.deposit();
				B.show();
				break;
				
				case 2:
				try
				{
					B.withdraw();
				}
				catch(FundException F)
				{
					F.getMsg();
				}
				finally
				{
					B.show();
				}
				break;
				
				case 3:
				B.show();
				break;
				
				case 4:
				System.exit(1);
				
				default:
				System.out.println("Wrong choice ");
			}
		}
	}
}
