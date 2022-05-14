package entitiesSec8;

public class Student70 {

	public String nome;
	public double trimestre1;
	public double trimestre2;
	public double trimestre3;

	public void notaFinal() {
		double nf = trimestre1 + trimestre2 + trimestre3;
		System.out.printf("FINAL GRADE = %.2f%n", nf);
		if (nf > 59) {
			System.out.println("PASS");
		} else {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS", 60 - nf);
		}
	}
}
