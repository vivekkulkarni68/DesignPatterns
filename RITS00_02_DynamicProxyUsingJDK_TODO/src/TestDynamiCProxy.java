public class TestDynamiCProxy {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Bank bank = BankFactory.getInstance("SBI", "accountHolder");
		System.out.println("Proxy for customer is " + bank.getClass().getName());
		bank.withdraw(100);
		bank.deposit(200);
		Bank bank2 = BankFactory.getInstance("AXIS", "banker");
		bank2.deposit(100);
		try {
			bank2.withdraw(100);
		} catch (Throwable iex) {
			System.out.println("Withdrawal Failed due to" + iex.getCause().getClass().getName());
			// iex.printStackTrace();
		}
		Bank bank3 = BankFactory.getInstance("AXIS", "manager");
		try {
			bank3.withdraw(100);
		} catch (Throwable th) {
			// th.printStackTrace();
		}

	}

}
