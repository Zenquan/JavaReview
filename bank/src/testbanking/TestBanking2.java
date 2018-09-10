package testbanking;
import banking2.Account;
import banking2.Customer;
public class TestBanking2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customer = new Customer("Zenquan", "Can");
		Account account = new Account(520);
//		customer.setAccount(account);
		System.out.println(customer.getFirstName()+" "+customer.getLastName()+" "+account.getBalance());
		customer.getAccount().withdraw(250);
		System.out.println(account.getBalance());
	}

}
