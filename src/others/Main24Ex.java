package others;

import java.util.Locale;

public class Main24Ex {

	public static void main(String[] args) {

		String product1 = "Computer";
		String product2 = "Office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.println("Products:");
		System.out.printf("%s, price is R$ %.2f%n", product1, price1);
		System.out.printf("%s, price is R$ %.2f%n%n", product2, price2);
		System.out.printf("Record: %d years old, code %d, gender: %s%n%n", age, code, gender);
		System.out.printf("Measure with 8 decimals: %.8f%n", measure);
		System.out.printf("Rouded value to 3 decimals: %.3f%n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US regionalized value: %.3f", measure);
	}

}
