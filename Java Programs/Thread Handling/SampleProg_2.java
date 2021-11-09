/*public String getName(): returns the name of the thread.
public void setName(String name): changes the name of the thread.*/
class SampleProg_2 extends Thread
{
	public void run()
	{
		System.out.println("Execute ");
	}
	public static void main(String args[])
	{
		SampleProg_2 ob=new SampleProg_2();
		SampleProg_2 ob2=new SampleProg_2();
		ob.start();
		System.out.println("Name of Thread : "+ob.getName());
		ob.setName("Koustav ");
		System.out.println("Name of Thread : "+ob.getName());
		ob2.start();
		System.out.println("Name of Thread : "+ob2.getName());
		ob2.setName("Koustav ");
		System.out.println("Name of Thread : "+ob2.getName());
	}
}
