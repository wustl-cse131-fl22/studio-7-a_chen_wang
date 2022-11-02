package studio7;

public class Complex {
	
	private double real, imaginary;
	
	public Complex(double real, double imaginary) {
		this.real=real;
		this.imaginary=imaginary;
	}
	
	public double getReal(){
		return real;
	}
	
	public double getImag() {
		return imaginary;
	}
	
	public Complex ass(Complex c) {
		Complex temp = new Complex(real+c.getReal(), imaginary+c.getImag());
		return temp;
	}
	
	public Complex multiply(Complex q) {
		Complex temp = new Complex(real*q.getReal()-imaginary*q.getImag(), real*q.getImag()+q.getReal()*imaginary);
		return temp;
	}
	
	public String toString() {
		return (real + " " + imaginary + "i");
	}
	
}
