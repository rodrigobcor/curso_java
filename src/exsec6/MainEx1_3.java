package exsec6;

import java.util.Scanner;

public class MainEx1_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int tipo, alcool = 0, gasolina = 0, diesel = 0;

		tipo = sc.nextInt();

		while (tipo != 4) {
			if (tipo == 1) {
				alcool++;
			} else if (tipo == 2) {
				gasolina++;
			} else if (tipo == 3) {
				diesel++;
			}
			tipo = sc.nextInt();
		}

		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);

		sc.close();

	}

}
