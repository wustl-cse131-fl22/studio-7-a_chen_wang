package studio7;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r1 = new Rectangle(3, 4);
		Rectangle r2 = new Rectangle(3, 3);
		System.out.println(r1.isSquare());
		System.out.println(r2.isSquare());
		
		Die d1 = new Die(8);
		int[] arr = new int[8];
		for(int i = 0; i < 30000; i++) {
			arr[d1.roll()-1]++;
		}
		for(int i = 0; i < 8; i++) {
			System.out.println(arr[i]);
		}
		
		Fraction f1 = new Fraction(36, 144);
		Fraction f2 = new Fraction(33, 42);
		System.out.println(f1.reciprocal());
		System.out.println(f1.multiply(f2));
		System.out.println(f1.simp());
		
		Complex c1 = new Complex(2.3, 5.4);
		Complex c2 = new Complex(4.432, 11.21);
		System.out.println(c1.multiply(c2));
		System.out.println(c1.ass(c2));
		
		
		System.out.println();
		HockeyPlayer h1 = new HockeyPlayer("William", "Left", "Left", 34);
		h1.game(h1, 3, 4);
		System.out.println(h1);
		
	}

}
