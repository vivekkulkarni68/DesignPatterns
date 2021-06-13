
//Adapter Class

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class MapIteratorImpl implements MapIterator {
	// TODO NICE # decide adaptee
	int size;
	int currentPosition;
	Set keys;
	Collection values;
	Iterator keyIterator;
	Iterator entrySetIterator;
	Iterator valueIterator;
	Set<Map.Entry> entrySet;

	MapIteratorImpl(?? adaptee) {
		this.adaptee = adaptee;
		keys = adaptee.keySet();
		values = adaptee.values();
		valueIterator = values.iterator();
		keyIterator = keys.iterator();
		entrySet = adaptee.entrySet();
		entrySetIterator = entrySet.iterator();
		size = adaptee.size();
	}

	//NICE TODO : implements all methods from MapIterator
}
