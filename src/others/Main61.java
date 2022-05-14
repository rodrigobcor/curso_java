package others;

import java.util.Scanner;

public class Main61 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter three numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int higher = max(a, b, c);

		showResult(higher);

		sc.close();
	}

	public static int max(int value1, int value2, int value3) {
		int aux;
		if (value1 > value2 && value1 > value3) {
			aux = value1;
		} else if (value2> value3) {
			aux = value2;
		} else {
			aux = value3;
		}
		return aux;
	}
	
	public static void showResult(int value) {
		System.out.println("Higher value: " + value);
	}
	
}
