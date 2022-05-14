package exsec4;

import java.util.Scanner;

public class MainEx1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a, b;

		a = sc.nextInt();
		b = sc.nextInt();

		System.out.printf("Soma = %d", a + b);

		sc.close();
	}

}
