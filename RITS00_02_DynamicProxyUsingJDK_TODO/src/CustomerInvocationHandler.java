import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class CustomerInvocationHandler implements InvocationHandler {
	// TODO get the access to Bank

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO log entry and exit of the method
		// TODO call target object
		// TODO get the return value and retrun it.
		return null;

	}
}
