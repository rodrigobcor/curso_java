package appSec10;

import java.util.Locale;
import java.util.Scanner;

public class Main89 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double[] vect = new double[n];
		double media = 0;
		
		for (int i = 0; i < n; i++) {
			vect[i] = sc.nextDouble();
			media += vect[i] / n;
		}
		
		System.out.printf("AVERAGE HEIGHT = %.2f", media);		
		
		sc.close();
	}

}
