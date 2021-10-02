import java.util.*;

class Addition {
    int s;
	Addition()
	{
		s=0;
	}
    Addition (int c, int d) {
        s = c + d;
    }

    void display() {
        System.out.println(s);
    }

    public static void main(String args[]) {
        int a, b;
        Scanner sc = new Scanner(System.in);
		
        System.out.println("Enter two numbers:");
        a = sc.nextInt();
        b = sc.nextInt();
		Addition t1 = new Addition();
		t1.display();
        
        Addition  t2 = new Addition(a, b);
        t2.display();

    }
}