import java.util.*;
class Rearrange
{
	String wrd, newwrd;
	Rearrange()
	{
		wrd="";
		newwrd="";
	}
	void readword()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the word : ");
		wrd=sc.next();
		wrd=wrd.toUpperCase();// convert into uppercase
	}
	void freq_vow_con()
	{
		int v=0,c=0;
		for(int i=0;i<wrd.length();i++)
		{
			char ch=wrd.charAt(i); // extract each character from string
			if(ch=='A' || ch=='E' || ch=='O' || ch=='U' || ch=='I')
				v++;
			else if(ch>'A' && ch<='Z')
				c++;
		}
		System.out.println("Frequency of vowel "+v);
		System.out.println("Frequency of consonants "+c);
	}
	void arrange()
	{
		String v="",c="";
		for(int i=0;i<wrd.length();i++)
		{
			char ch=wrd.charAt(i); // extract each character from string
			if(ch=='A' || ch=='E' || ch=='O' || ch=='U' || ch=='I')
				v=v+ch;
			else if(ch>'A' && ch<='Z')
				c=c+ch;
		}
		newwrd=v+c;
	}
	void display()
	{
		System.out.println("Original word : "+wrd);
		System.out.println("New word : "+newwrd);
	}
}
public class Arrmain
{
	public static void main(String args[])
	{
	  Rearrange ob=new Rearrange();
	  ob.readword();
	  ob.freq_vow_con();
	  ob.arrange();
	  ob.display();
	}
}