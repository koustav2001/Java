import java.lang.*;  
  
public class PriorityExample extends Thread   
{  
  public void run()  
  {  
	System.out.println("Inside the run() method");  
  }  
  
public static void main(String argvs[])  
{  
	PriorityExample th1 = new PriorityExample();  
	PriorityExample th2 = new PriorityExample();  
	PriorityExample th3 = new PriorityExample();  
  
	System.out.println("Priority of the thread th1 is : " + th1.getPriority());  
	System.out.println("Priority of the thread th2 is : " + th2.getPriority());
	System.out.println("Priority of the thread th3 is : " + th3.getPriority());	
	th1.setPriority(6);  
	th2.setPriority(3);  
	th3.setPriority(9);  
    
	System.out.println("Priority of the thread th1 is : " + th1.getPriority());    
	System.out.println("Priority of the thread th2 is : " + th2.getPriority());    
	System.out.println("Priority of the thread th3 is : " + th3.getPriority());  
  }  
}