public class SBI implements Bank {

	@Override
	public void withdraw(int amount) {
		System.out.println("Withdraw method called " + amount);

	}

	@Override
	public int deposit(int amount) {
		System.out.println("Deposit method called " + amount);
		return amount;
	}

}
