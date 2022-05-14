package entitiesSec8;

public class Employee70 {

	public String name;
	public double grossSalary;
	public double tax;
	
	public double netSalary() {
		return grossSalary - tax;
	}
	
	public void increaseSalary(double percentage) {
		double percent = percentage / 100;
		grossSalary += (grossSalary * percent);
	}
}
