package exsec6;

import java.util.Locale;
import java.util.Scanner;

public class MainEx2_4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if (b == 0) {
				System.out.println("divisao impossivel");
			} else {
				System.out.printf("%.1f%n", (double) a / b);
			}
		}

		sc.close();

	}

}
