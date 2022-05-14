package exsec6;

import java.util.Scanner;

public class MainEx2_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int contin = 0, contout = 0;

		for (int i = 1; i <= N; i++) {
			int x = sc.nextInt();
			if (x >= 10 && x <= 20) {
				contin++;
			} else {
				contout++;
			}
		}

		System.out.println(contin + " in");
		System.out.println(contout + " out");

		sc.close();

	}

}
