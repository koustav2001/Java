import java.util.Scanner;
class Average
{
    double avg;
	Average()
	{
		avg=0.0;
	}
    Average(double a, double b, double c)
    {
        avg= (a+b+c)/3;
    }
	public void display()
	{
		System.out.println("Average of three numbers "+avg);
	}
}
class AverageNumber
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of a1");
        double a1= sc.nextDouble();
        System.out.println("Enter the value of a2");
        double a2= sc.nextDouble();
        System.out.println("Enter the value of a3");
        double a3= sc.nextDouble();
        Average obj =new Average(a1, a2, a3);
		obj.display();
		Average obj1 =new Average();
        obj1.display();
    }
}