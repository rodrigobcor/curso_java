package exsec6;

import java.util.Scanner;

public class MainEx2_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();

		if (x < 0 || x > 1000) {
			System.out.println("Inserir novamente");
			x = sc.nextInt();
		}

		for (int i = 1; i <= x; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}

		sc.close();

	}

}
