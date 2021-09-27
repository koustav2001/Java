//implement multiple inheritance
import java.util.*;
class Student
{
	String name;
	int marks;
	void getdata()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the name ");
		name=sc.nextLine();
		System.out.print("Enter marks : ");
		marks=sc.nextInt();
	}
	
	void putdata()
	{
		System.out.println("Name of the students "+name);
		System.out.println("marks of the student "+marks);
	}
}
interface sports
{
	void score();
}
class Grade extends Student implements sports
{
	int s;
	String gr;
	public void score()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter score : ");
		s=sc.nextInt();
	}
	
	void assign()
	{
		double av=(marks+s)/2.0;
		if(av>85)
			gr="Very Good";
		else if(av>70)
			gr="Good";
		else if(av>60)
			gr="Moderate";
		else
			gr="Bad";
	}
	void putdata()
	{
		super.putdata();//parent class function
		System.out.println("Sports score "+s);
		System.out.println("Grade of the student : "+gr);
	}
}
public class Multi
{
	public static void main(String args[])
	{
		Grade G=new Grade();
		G.getdata();
		G.score();
		G.assign();
		G.putdata();
	}
}