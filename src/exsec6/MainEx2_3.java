package exsec6;

import java.util.Locale;
import java.util.Scanner;

public class MainEx2_3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double c = sc.nextDouble();
			System.out.printf("%.1f%n", (a / 3 + b / 3 + c / 3));
		}

		sc.close();

	}

}
