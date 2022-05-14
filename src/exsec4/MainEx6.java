package exsec4;

import java.util.Locale;
import java.util.Scanner;

public class MainEx6 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double a, b, c;

		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();

		System.out.printf("TRIANGULO: %.3f%n", (a * c / 2.0));
		System.out.printf("CIRCULO: %.3f%n", (3.14159 * c * c));
		System.out.printf("TRAPEZIO: %.3f%n", (a + b) / 2 * c);
		System.out.printf("QUADRADO: %.3f%n", b * b);
		System.out.printf("RETANGULO: %.3f%n", a * b);

		sc.close();
	}

}
