package appsSec8;

import java.util.Locale;
import java.util.Scanner;

import entitiesSec8.Calculator72;

public class Main72 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.printf("Raio: ");
		double raio = sc.nextDouble();

		System.out.printf("Circunferencia: %.2f%n", Calculator72.circunferencia(raio));
		System.out.printf("Volume: %.2f%n", Calculator72.volume(raio));
		System.out.printf("Valor de PI: %.2f%n", Calculator72.PI);

		sc.close();

	}

}
