package entitiesSec8;

public class Triangle66 {

	public double a;
	public double b;
	public double c;	
	
	public double area() {
		double p = (a + b + c) / 2;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}
}
