package exsec6;

import java.util.Scanner;

public class MainEx2_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int fat = 1;

		if (n == 0) {
			System.out.println(1);
		} else {
			for (int i = n; i > 0; i--) {
			fat *= i;
			}
			System.out.println(fat);
		}

		sc.close();
	}

}
