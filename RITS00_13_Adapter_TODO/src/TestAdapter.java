import java.util.HashMap;
import java.util.Map;

public class TestAdapter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Map map = new HashMap();
		map.put("1", "msg1");
		map.put("2", "msg2");
		map.put("3", "msg3");
		map.put("4", "msg4");
		map.put("5", "msg5");
		printMap(map);
	}

	private static void printMap(Map map) {
		MapIterator iter = new MapIteratorImpl(map);
		while (iter.hasNextKey()) {
			System.out.println(iter.nextKey() + " " + iter.nextValue());
		}

	}

}
