package exsec5;

import java.util.Scanner;

public class MainEx1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x;

		x = sc.nextInt();

		if (x > -1) {
			System.out.println("NAO NEGATIVO");
		} else {
			System.out.println("NEGATIVO");
		}

		sc.close();
	}

}
