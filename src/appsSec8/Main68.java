package appsSec8;

import java.util.Locale;
import java.util.Scanner;

import entitiesSec8.Product68;

public class Main68 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Product68 prod = new Product68();

		System.out.println("Enter product data: ");
		System.out.printf("Name: ");
		prod.name = sc.next();
		System.out.printf("Price: ");
		prod.price = sc.nextDouble();
		System.out.printf("Quantity in stock: ");
		prod.qt = sc.nextInt();

		System.out.println(prod);
		System.out.printf("Enter the number of products to be added in stock: ");
		prod.AddProducts(sc.nextInt());
		System.out.println(prod);
		System.out.printf("Enter the number of products to be removed from stock: ");
		prod.RemoveProducts(sc.nextInt());
		System.out.println(prod);

		sc.close();
	}

}
