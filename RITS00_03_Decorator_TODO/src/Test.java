import com.rkit.components.Account;
import com.rkit.components.CreditCardAccount;
import com.rkit.decorators.Clubmember;
import com.rkit.decorators.GoldMember;

public class Test {
	public static void main(String[] args) {
		Account acct = new CreditCardAccount();
		System.out.println("Default OD " + acct.getODLimit());
		Clubmember clubMember = new GoldMember(acct);
		System.out.println("OD after gold membership " + clubMember.getODLimit());
	}
}
