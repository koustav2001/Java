import java.util.*;

class Calculator {
    int a,s,q,m;
	float rem;
	Calculator()
	{
		a=0;
		s=0;
		q=0;
		m=0;
		rem=0.0f;	
	}
    Calculator (int c, int d) {
        a = c + d;
		s = c - d;
		q = c / d;
		m = c * d;
		rem = c % d; 
    }

    void display() {
        System.out.println(a);
		System.out.println(s);
		System.out.println(q);
		System.out.println(m);
		System.out.println(rem);
    }

    public static void main(String args[]) {
        int a, b;
        Scanner sc = new Scanner(System.in);
		
        System.out.println("Enter two numbers:");
        a = sc.nextInt();
        b = sc.nextInt();
		Calculator t1 = new Calculator();
		t1.display();
        
        Calculator t2 = new Calculator(a, b);
        t2.display();

    }
}