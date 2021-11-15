class Simple1 extends Thread
{  
 public void run()
 {  
    for(int i=1;i<=5;i++)
  {    
   try{    
    Thread.sleep(500);    
   }catch(Exception e){}    
  System.out.println(i);    
  }    
 }  
}  
  
class Simple2 extends Thread
{  
 public void run()
 {  
    for(int i=5;i>=1;i--)
  {    
   try{    
    Thread.sleep(500);    
   }catch(Exception e){}    
  System.out.println(i);    
  }     
 }  
}  
  
 public class Multitasking_2
 {  
	public static void main(String args[])
	{  
	Simple1 t1=new Simple1();  
	Simple2 t2=new Simple2();  
  
	t1.start();  
	t2.start();  
 }  
}
