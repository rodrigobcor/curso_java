package appSec10;

import java.util.Locale;
import java.util.Scanner;

import entitiesSec10.Product90;

public class Main90 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Product90[] vect = new Product90[n];
		double media = 0;

		for (int i = 0; i < vect.length; i++) {
			sc.nextLine();
			String nome = sc.nextLine();
			double preco = sc.nextDouble();
			vect[i] = new Product90(nome, preco);
			media += vect[i].getPrice() / n;
		}
		
		System.out.printf("AVERAGE PRICE = %.2f", media);
		
		sc.close();
	}

}
