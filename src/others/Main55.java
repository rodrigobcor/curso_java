package others;

import java.util.Locale;
import java.util.Scanner;

public class Main55 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double cels;
		char rep;

		do {
			System.out.printf("Digite a temperatura em Celsius: ");
			cels = sc.nextDouble();
			System.out.printf("Equivalente em Fahrenheint: %.1f%n", (double) 9 * cels / 5 + 32);
			System.out.printf("Deseja repetir (s/n)? ");
			sc.nextLine();
			rep = sc.next().charAt(0);
		} while (rep == 's');

		sc.close();

	}
}
