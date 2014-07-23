package kkt.java.collections;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {

		 Set hashSet = new HashSet();
	      hashSet.add(1);
	      hashSet.add(5);
	      hashSet.add(2);
	      hashSet.add(11);
	      hashSet.add(43);
	      hashSet.add(2);
	      hashSet.add(2);
	      hashSet.add(null);
	      displayList(hashSet);
	}
	public static void displayList(Collection l)
	{
		Iterator i=l.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
}
