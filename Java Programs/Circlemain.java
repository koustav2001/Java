import java.util.*;
import java.lang.*; //default package
interface Shape
{
	void accept();
	void calc();
}
class Circle implements Shape
{
	int r;
	double ar,pr;
	public void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius ");
		r=sc.nextInt();
	}
	public void calc()
	{
		ar=Math.PI*r*r;
		pr=2*Math.PI*r;
	}
	void show()
	{
		System.out.println("Area of circle "+ar);
		System.out.println("Perimeter of circle "+pr);
	}
}
public class Circlemain
{
	public static void main(String args[])
	{
		Circle ob=new Circle();
		ob.accept();
		ob.calc();
		ob.show();
	}
}