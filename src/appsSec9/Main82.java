package appsSec9;

import java.util.Locale;
import java.util.Scanner;

import entitiesSec9.Account82;

public class Main82 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Enter account number: ");
		int number = sc.nextInt();
		System.out.printf("Enter account holder: ");
		sc.nextLine();
		String name = sc.nextLine();
		Account82 account = new Account82(number, name);
		System.out.printf("Is there an initial deposit? (y/n) ");
		char x = sc.next().charAt(0);
		
		if (x == 'y') {
			System.out.printf("Enter initial deposit value: ");
			account.deposit(sc.nextDouble());
		} 
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.printf("Account %d, holder: %s, balance: $ %.2f%n", 
				account.getNumber(), account.getName(), account.getBalance());
		System.out.println();
		System.out.printf("Enter a deposit value: ");		
		account.deposit(sc.nextDouble());
		System.out.println("Updated account data:");
		System.out.printf("Account %d, holder: %s, balance: $ %.2f%n", 
				account.getNumber(), account.getName(), account.getBalance());
		System.out.println();
		System.out.printf("Enter a withdraw value: ");		
		account.withdraw(sc.nextDouble());
		System.out.println("Updated account data:");
		System.out.printf("Account %d, holder: %s, balance: $ %.2f%n", 
				account.getNumber(), account.getName(), account.getBalance());
		
		sc.close();
	}

}
