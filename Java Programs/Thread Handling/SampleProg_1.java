/*public void sleep(long miliseconds): 
Causes the currently executing thread to sleep
(temporarily cease execution)
 for the specified number of milliseconds.*/
 class SampleProg_1 extends Thread
{
	public void run()
	{
		try
		{
		  for(int i=1;i<=5;i++)
		  {
			  Thread.sleep(2000);
			  System.out.println(i);
		  }
		}
		catch(Exception e){}
	}
	public static void main(String args[])
	{
		SampleProg_1 ob=new SampleProg_1();
		SampleProg_1 ob2=new SampleProg_1();
		ob.start();
		ob2.start();
	}
}
