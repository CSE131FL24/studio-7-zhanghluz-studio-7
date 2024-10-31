package studio7;
import java.util.Scanner;
import edu.princeton.cs.introcs.StdDraw;

public class Rectangle {
	//instance variables
	private double length;
	private double width;
	
	//constructor
	public Rectangle(double actualLength, double actualWidth) {
		length =  actualLength;
		width = actualWidth;
		
		
	}
	public double calculateArea() {
		return length * width;
	}
	public double calculatePerimeter() {
		return length * 2 + width * 2;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle Jasmine = new Rectangle(3.0, 2.0);
		System.out.println(Jasmine.calculateArea());
		System.out.println(Jasmine.calculatePerimeter());
	
	}

}
