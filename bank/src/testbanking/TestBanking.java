package testbanking;
import banking1.Account;

public class TestBanking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account = new Account(500.00);
		account.deposit(22.5);
		System.out.println(account.getBalance());
		account.withdraw(47.62);
		System.out.println(account.getBalance());
	}

}
