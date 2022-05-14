package appSec10;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entitiesSec10.Employee96;

public class Main96 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee96> list = new ArrayList<>();

		System.out.printf("How many employees will be registered? ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println();
			System.out.printf("Emplyee #%d%n", i);
			System.out.printf("Id: ");
			int id = sc.nextInt();
			System.out.printf("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.printf("Salary: ");
			double salary = sc.nextDouble();
			list.add(new Employee96(id, name, salary));
		}
		
		System.out.printf("Enter the employee id that will have salary increase: ");
		int id = sc.nextInt();
		System.out.printf("Enter the percentage: ");
		
		
		sc.close();
	}
// nao terminei
}
