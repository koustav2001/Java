import java.util.*;
public class Student
{
	String name;
	int age;
	String address;
	Student()//initialize with default value
	{
		name="unknown";
		age=0;
		address="not available";
	}
	void setInfo(String n,int a,String add)
	{
		name=n;
		age=a;
		address=add;
	}
	void display()
	{
		System.out.println("Name "+name);
		System.out.println("Age "+age);
		System.out.println("Address "+address);
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Student s[] =new Student[10];
		//ob.display();
		//ob.setInfo("John",25);
		//ob.display();
		for(int i=0;i<2;i++)
		{
			System.out.println("Enter the age ");
			int age = sc.nextInt();
			System.out.println("Enter the name ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Enter the address ");
			String address = sc.nextLine();
			s[i] = new Student();
			s[i].setInfo(name,age,address);
		}
		for(int i=0;i<2;i++)
		{
			s[i].display();
		}
	}
}