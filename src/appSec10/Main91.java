package appSec10;

import java.util.Locale;
import java.util.Scanner;

import entitiesSec10.Rooms91;

public class Main91 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Rooms91[] vect = new Rooms91[10];

		System.out.printf("How many rooms will be rented? ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println();
			System.out.printf("Rent #%d:%n", i);
			sc.nextLine();
			System.out.printf("Name: ");
			String name = sc.nextLine();
			System.out.printf("Email: ");
			String email = sc.nextLine();
			System.out.printf("Room: ");
			int room = sc.nextInt();
			vect[room] = new Rooms91(name, email, room);
		}
		
		System.out.println();
		System.out.println("Busy rooms:");
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] != null) {
				System.out.printf("%d: %s, %s%n", vect[i].getRoom(), vect[i].getName(), vect[i].getEmail());
			}
		}

		sc.close();

	}

}
