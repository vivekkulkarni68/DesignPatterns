package test;

import static org.junit.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import org.junit.Test;

import com.rkit.ConnectionPool;

public class TestSIngleton {

	@Test
	public void testStaticMethod() {
		ConnectionPool pool1 = ConnectionPool.getInstance();
		assertEquals(true, pool1 != null);
		ConnectionPool pool2 = ConnectionPool.getInstance();
		assertEquals(pool1, pool2);
	}

	@Test(expected = InvocationTargetException.class)
	public void testConstructor() throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class c = Class.forName("com.rkit.ConnectionPool");
		Constructor[] constructors = c.getConstructors();
		assertEquals(0, constructors.length);
		Constructor[] cons = c.getDeclaredConstructors();
		assertEquals(1, cons.length);
		cons[0].setAccessible(true);
		cons[0].newInstance(null);
	}

	@Test(expected = CloneNotSupportedException.class)
	public void testClone() throws ClassNotFoundException, InstantiationException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException, CloneNotSupportedException {
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.clone();
	}

	@Test
	public void serialize() throws FileNotFoundException, IOException, ClassNotFoundException {
		ConnectionPool pool = ConnectionPool.getInstance();
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("pool.ser"));
		oos.writeObject(pool);
		oos.close();
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("pool.ser"));
		ConnectionPool pool2 = (ConnectionPool) ois.readObject();
		ois.close();
		assertEquals(pool, pool2);
	}

}
