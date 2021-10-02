public class Murica {
	String p1 = "* * * * * * ================================\n * * * * *  ================================";
    String p2 = "============================================";
	Murica()
	{
        for (int i = 0; i < 4; i++) {
            System.out.println(p1);
        }
	}
	Murica(String s)
	{
		System.out.println("* * * * * * ================================");
        for (int i = 0; i < 6; i++) {
        System.out.println(p2);
		}
	}
    public static void main(String[] args) {
        Murica ob = new Murica();
		Murica ob1 = new Murica(p2);
        }
    }
