package exsec4;

import java.util.Locale;
import java.util.Scanner;

public class MainEx4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int num, horas;
		double salarioHora;

		num = sc.nextInt();
		horas = sc.nextInt();
		salarioHora = sc.nextDouble();

		System.out.println("NUMBER = " + num);
		System.out.printf("SALARY = U$%.2f", horas * salarioHora);

		sc.close();
	}
}
