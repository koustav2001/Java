import java.util.*;

class Product3 {
    int s;
	Product3()
	{
		s=0;
	}
    Product3 (int c, int d) {
        s = c * d;
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
		Product3  t1 = new Product3();
		t1.display();
        
        Product3  t2 = new Product3(a, b);
        t2.display();

    }
}