package appsSec8;

import java.util.Locale;
import java.util.Scanner;

import entitiesSec8.Triangle65;

public class Main65 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Triangle65 x = new Triangle65();
		Triangle65 y = new Triangle65();

		System.out.println("Lados do triangulo x: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Lados do triangulo y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();

		double px = (x.a + x.b + x.c) / 2;
		double areaX = Math.sqrt(px * (px - x.a) * (px - x.b) * (px - x.c));
		double py = (y.a + y.b + y.c) / 2;
		double areaY = Math.sqrt(py * (py - y.a) * (py - y.b) * (py - y.c));

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
