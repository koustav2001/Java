//String manipulation
import java.util.*;
class Exchange
{
	String sent,rev;
	int size;
	Exchange()
	{
		sent="";
		rev="";
		size=0;
	}
	void readsentence()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the sentence ");
		sent=sc.nextLine();
	}
	void exfirstLast()
	{
		StringTokenizer st=new StringTokenizer(sent);
		size=st.countTokens();
		for(int i=1;i<=size;i++)
		{
			String w=st.nextToken();  //friends
			int l=w.length(); //7  sriendf
			if(l==1)
				rev=rev+w+" ";
			else
			{
				String nw=w.charAt(l-1)+w.substring(1,l-1)+w.charAt(0);
				rev=rev+nw+" ";
			}
		}
	}
	void display()
	{
		System.out.println("Original sentence "+sent);
		System.out.println("Modified sentence "+rev);
	}
}
public class Exmain
{
	public static void main(String args[])
	{
		Exchange ob= new Exchange();
		ob.readsentence();
		ob.exfirstLast();
		ob.display();
	}
}