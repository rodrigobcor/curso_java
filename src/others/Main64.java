package others;

import java.util.Locale;
import java.util.Scanner;

public class Main64 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double xA, xB, xC, yA, yB, yC;
		
		System.out.println("Lados do triangulo x: ");
		xA = sc.nextDouble();
		xB = sc.nextDouble();
		xC = sc.nextDouble();
		System.out.println("Lados do triangulo y: ");
		yA = sc.nextDouble();
		yB = sc.nextDouble();
		yC = sc.nextDouble();
		
		double px = (xA + xB + xC) /2;
		double areaX = Math.sqrt(px * (px - xA) * (px - xB) * (px - xC));
		double py = (yA + yB + yC) /2;
		double areaY = Math.sqrt(py * (py - yA) * (py - yB) * (py - yC));
		
		System.out.printf("Area x: %.4f%n", areaX);
		System.out.printf("Area y: %.4f%n", areaY);
		
		if (areaX > areaY) {
			System.out.println("area x maior");
		} else {
			System.out.println("area y maior");
		}
		
		sc.close();
	}

}
