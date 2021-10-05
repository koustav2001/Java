import java.util.*;
class Capital
{
	String sent;
	int freq;
	Capital()
	{
		sent="";
		freq=0;
	}
	void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter sentence ");
		sent=sc.nextLine();
	}
	boolean isCap(String w)
	{
		char fc=w.charAt(0); // extract single character from string
		if(Character.isUpperCase(fc)==true) //(ch>='A' && ch<='Z')
			return true;
		else
			return false;
	}
	
	void display()
	{
		System.out.println("Original sentence "+sent);
		StringTokenizer st=new StringTokenizer(sent);
		int wc=st.countTokens(); // no. of words 
		for(int i=1;i<=wc;i++)
		{
			String w=st.nextToken(); // extract each word
			if(isCap(w)==true)
				freq++;
		}
		System.out.println("Frequency of word that begins with Capital letter : "+freq);
	}
}
public class Cap
{
	public static void main(String args[])
	{
		Capital ob=new Capital();
		ob.input();
		ob.display();
	}	
}