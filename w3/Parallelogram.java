package Shapes;

public class Parallelogram extends Rectangle {
	double width;
	double length;
	
	public Parallelogram(double width, double height) {
		this.width = width;
		this.length = height;
	}
	
	public Parallelogram() {

	}
	
	//Getters
	public double getWidth() {
		return this.width;
	}
	
	public double getLength() {
		return this.length;
	}
	
	//Setters
	public void setWidth(double width, double length) {
		this.width = width;
		this.length = length;
		
	}

	//Perimeter
	@Override
	public double perimeter() {
		return (getWidth() * 2) + (getLength() * 2);
	}

	@Override
	public double getSide() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getRadius() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public String toString() {
		return ("Parallelogram {w=" + width + ", " + "h=" + length + "} perimeter = " + perimeter() + "\n\n");
	}
}
