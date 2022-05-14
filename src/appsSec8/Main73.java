package appsSec8;

import java.util.Locale;
import java.util.Scanner;

import entitiesSec8.CurrencyConverter73;

public class Main73 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.printf("Dolar to BRL ratio: ");
		double rate = sc.nextDouble();
		System.out.printf("Amount of dollar to be bought: ");
		double dolarTotal = sc.nextDouble();
		
		System.out.printf("Total amount in BRL = %.2f", 
				CurrencyConverter73.dolarToReal(rate, dolarTotal));

		sc.close();

	}

}
