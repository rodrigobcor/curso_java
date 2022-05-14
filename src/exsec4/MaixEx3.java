package exsec4;

import java.util.Locale;
import java.util.Scanner;

public class MaixEx3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int A, B, C, D;

		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();

		System.out.printf("DIFERENCA = %d", (A * B - C * D));

		sc.close();
	}
}
