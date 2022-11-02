package studio7;

public class Fraction {

	public int numerator, denominator;
	
	public Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}
	
	public int getNumerator() {
		return numerator;
	}
	
	public int getDenominator() {
		return denominator;
	}
	
	public Fraction addFractions(Fraction f) {
		Fraction temp = new Fraction(f.getNumerator()*denominator + f.getDenominator()*numerator, denominator*f.getDenominator());
		return temp;
	}
	
	public Fraction multiply(Fraction f) {
		Fraction temp = new Fraction(f.getNumerator()*numerator, f.getDenominator()*denominator);
		return temp;
	}
	
	public Fraction reciprocal() {
		Fraction temp = new Fraction(denominator, numerator);
		return temp;
	}
	
	public Fraction simp() {
		int max = 1;
		for(int i = 2; i <= numerator && i < denominator/2; i++) {
			if(numerator%i==0 && denominator%i==0) {
				max = i;
			}
		}
		Fraction temp = new Fraction(numerator/=max, denominator/=max);
		return temp;
		
	}
	
	public String toString() {
		return (numerator + " " +  denominator);
	}
	
}
