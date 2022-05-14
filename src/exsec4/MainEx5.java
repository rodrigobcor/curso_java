package exsec4;

import java.util.Locale;
import java.util.Scanner;

public class MainEx5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int cp1, cp2, np1, np2;
		double vp1, vp2;

		cp1 = sc.nextInt();
		np1 = sc.nextInt();
		vp1 = sc.nextDouble();
		cp2 = sc.nextInt();
		np2 = sc.nextInt();
		vp2 = sc.nextDouble();

		System.out.printf("Valor a pagar: R$%.2f", (np1 * vp1) + (np2 * vp2));

		sc.close();
	}

}
