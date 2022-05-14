package appsSec8;

import java.util.Locale;
import java.util.Scanner;

import entitiesSec8.Triangle66;

public class Main66 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Triangle66 x = new Triangle66();
		Triangle66 y = new Triangle66();

		System.out.println("Lados do triangulo x: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Lados do triangulo y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		System.out.printf("Area x: %.4f%n", x.area());
		System.out.printf("Area y: %.4f%n", y.area());

		if (x.area() > y.area()) {
			System.out.println("area x maior");
		} else {
			System.out.println("area y maior");
		}

		sc.close();
	}

}
