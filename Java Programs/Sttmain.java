import java.util.*;
class Student
{
	private String name;
	private int m1,m2,m3;
	private double avg;
	
	void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the name : ");
		name=sc.nextLine();
		System.out.print("Enter the marks of three subjects ");
		m1=sc.nextInt();
		m2=sc.nextInt();
		m3=sc.nextInt();
	}
	void calc()
	{
		avg=(m1+m2+m3)/3.0;
	}
	void show()
	{
		System.out.println("Name of the student : "+name);
		System.out.println("Average marks "+avg);
	}
	double marks()
	{
		return avg;
	}
}
class Grade extends Student
{
	private char gr;
	void find()
	{
		double a=marks();
		if(a>80)
			gr='A';
		else if(a>=61)
			gr='B';
		else if(a>=41)
			gr='C';
		else
			gr='D';
	}
	void show()
	{
		super.show();
		System.out.println("Grade of the Student "+gr);
	}
	char getGrade()
	{
		return gr;
	}
}
class Scholarship extends Grade
{
	private double svalue;
	
	void assign()
	{
		double a=marks(); // average marks
		char g=getGrade();
		if(g=='A')
			 svalue=a*100;
		 else if(g=='B')
			 svalue=a*50;
		 else
			 svalue=0;
	}
	void show()
	{
		super.show();
		System.out.println("Scholarship Amount "+svalue);
	}
}
class Sttmain
{
	public static void main(String args[])
	{
		Scholarship ob=new Scholarship();
		ob.input();
		ob.calc();
		ob.find();
		ob.assign();
		ob.show();
	}
}