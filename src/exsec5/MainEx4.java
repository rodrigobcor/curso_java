package exsec5;

import java.util.Scanner;

public class MainEx4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int hi, hf;

		hi = sc.nextInt();
		hf = sc.nextInt();

		if (hi < hf) {
			System.out.printf("O JOGO DUROU: %d HORA(S)\n", (hf - hi));
		} else {
			System.out.printf("O JOGO DUROU: %d HORA(S)\n", ((24 + hf) - hi));
		}
		sc.close();
	}

}