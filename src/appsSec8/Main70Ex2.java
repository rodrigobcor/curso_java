package appsSec8;

import java.util.Locale;
import java.util.Scanner;

import entitiesSec8.Employee70;

public class Main70Ex2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee70 emp = new Employee70();
		
		System.out.printf("Name: ");
		emp.name = sc.nextLine();
		System.out.printf("Gross salary: ");
		emp.grossSalary = sc.nextDouble();
		System.out.printf("Tax: ");
		emp.tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("Employee: " + emp.name + ", $ " + emp.netSalary());
		System.out.println();
		System.out.printf("Which percentage to increase salary? ");
		emp.increaseSalary(sc.nextDouble());
		System.out.println();
		System.out.println("Update data: " + emp.name + ", $ " + emp.netSalary());
		
		sc.close();
	}

}
