package exsec5;

import java.util.Scanner;

public class MainEx2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x;

		x = sc.nextInt();

		if ((x % 2) != 0) {
			System.out.println("IMPAR");
		} else {
			System.out.println("PAR");
		}

		sc.close();
	}

}
