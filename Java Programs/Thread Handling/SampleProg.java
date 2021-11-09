/*public void run(): is used to perform action for a thread.
public void start(): starts the execution of the thread.
JVM calls the run() method on the thread.*/
class SampleProg extends Thread
{
	public void run()
	{
		System.out.println("Thread is Running...");
	}
	public static void main(String args[])
	{
		SampleProg ob=new SampleProg();
		ob.start();
	}
}
