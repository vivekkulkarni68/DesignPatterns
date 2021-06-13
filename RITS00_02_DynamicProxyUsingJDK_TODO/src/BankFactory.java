public class BankFactory {
	public static Bank getInstance(String bankName, String role) {
		// TODO return Customer Proxy if the role is "accountHolder"
		// TODO return BankProxy if the role is "banker"
		// TODO return OtherProxy if role is none of the above
		return null;
	}

	private static Bank getCustomerProxy(Bank bank) {
		Bank bankProxy = null;
		return bankProxy;
	}

	private static Bank getBankerProxy(Bank bank) {
		Bank bankProxy = null;
		return bankProxy;
	}

	private static Bank getOtherProxy(Bank bank) {
		Bank bankProxy = null;
		return bankProxy;
	}
}
