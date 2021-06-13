import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class BankerInvocationHandler implements InvocationHandler {
	// TODO get the bank reference

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO log entry and exit
		// TODO do not allow withdrawal(throw exception)
		// TODO allow deposit
		return null;
	}
}
