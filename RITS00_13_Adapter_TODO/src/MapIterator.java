import java.util.Map.Entry;

public interface MapIterator {

	void remove(Object key);

	boolean hasNextEntry();

	Object nextKey();

	boolean hasNextKey();

	Object nextValue();

	Entry nextEntry();

}
