package banking2;

public class Account {
	private double balance;
	public Account(double init_balance) {
		balance = init_balance;
	}
	public double getBalance() {
		return balance;
	}
	public void deposit(double atm) {
		balance += atm;
	}
	public void withdraw(double atm) {
		if(atm>balance) {
			System.out.println("Óà¶î²»×ã£¡");
		}else {
			balance -= atm;
		}
	}
}
