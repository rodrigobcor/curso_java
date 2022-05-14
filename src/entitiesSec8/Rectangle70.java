package entitiesSec8;

public class Rectangle70 {

	public double width;
	public double height;

	public double area() {
		return width * height;
	}

	public double perimeter() {
		return (width * 2) + (height * 2);
	}

	public double diagonal() {
		double d = Math.sqrt((width * width) + (height * height));
		return d;
	}
}
