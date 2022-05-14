package appsSec8;

import java.util.Locale;
import java.util.Scanner;

import entitiesSec8.Student70;

public class Main70Ex3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student70 aluno = new Student70();
		
		System.out.printf("Name: ");
		aluno.nome = sc.nextLine();
		System.out.printf("Nota 1: ");
		aluno.trimestre1 = sc.nextDouble();
		System.out.printf("Nota 2: ");
		aluno.trimestre2 = sc.nextDouble();
		System.out.printf("Nota 3: ");
		aluno.trimestre3 = sc.nextDouble();
		
		aluno.notaFinal();
		
		sc.close();
	}

}
