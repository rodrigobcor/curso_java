package entitiesSec9;

public class Account82 {
	
	private int number;
	private String name;
	private double balance;
	
	public Account82(int number, String name, double balance) {
		this.number = number;
		this.name = name;
		this.balance = balance;
	}

	public Account82(int number, String name) {
		this.number = number;
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getNumber() {
		return number;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		balance -= amount + 5;
	}
}
