package entities;

public class Rectangle {
	public double height;
	public double widht;
	
	public double area() {
		return height * widht;
	}

	public double perimeter() {
		return (2 * height) + (2 * widht);
	}
	
	public double diagonal() {
		return Math.sqrt((height * height) + (widht * widht));
	}
	
}
