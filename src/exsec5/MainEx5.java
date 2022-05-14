package exsec5;

import java.util.Locale;
import java.util.Scanner;

public class MainEx5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int cod, qt;

		cod = sc.nextInt();
		qt = sc.nextInt();

		if (cod == 1) {
			System.out.printf("Total: R$%.2f", (double) qt * 4.00);
		} else if (cod == 2) {
			System.out.printf("Total: R$%.2f", (double) qt * 4.50);
		} else if (cod == 3) {
			System.out.printf("Total: R$%.2f", (double) qt * 5.00);
		} else if (cod == 4) {
			System.out.printf("Total: R$%.2f", (double) qt * 2.00);
		} else if (cod == 5) {
			System.out.printf("Total: R$%.2f", (double) qt * 1.50);
		}

		sc.close();
	}

}
