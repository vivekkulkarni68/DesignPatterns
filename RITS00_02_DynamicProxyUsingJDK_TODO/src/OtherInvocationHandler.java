import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class OtherInvocationHandler implements InvocationHandler {
	Bank bank;

	OtherInvocationHandler(Bank bank) {
		this.bank = bank;
	}

	@Override
	public Object invoke(Object arg0, Method arg1, Object[] arg2) throws Throwable {
		// Do not allow the access by throwing appropriate exception.
		return null;
	}

}
