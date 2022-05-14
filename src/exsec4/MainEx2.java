package exsec4;

import java.util.Locale;
import java.util.Scanner;

public class MainEx2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double r;
		double pi = 3.14159;

		r = sc.nextDouble();

		System.out.printf("A = %.4f", (pi * Math.pow(r, 2)));

		sc.close();
	}

}
