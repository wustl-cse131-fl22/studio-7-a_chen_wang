package studio7;

import edu.princeton.cs.introcs.StdDraw;

public class Rectangle {

	public int length, width;
	
	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}
	
	public int getLength() {
		return length;
	}
	
	public int getWidth() {
		return width;
	}
	
	public int calcPerimeter() {
		return (getLength()+getWidth())*2;
	}
	
	public int calcArea() {
		return getLength()*getWidth();
	}
	
	public boolean isSquare() {
		return getLength()==getWidth();
	}
	
	public void drawRectangle(int x, int y) {
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.rectangle(x, y, getWidth()/2, getLength()/2);
	}
	
}
