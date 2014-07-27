package kkt.java.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {

	public static void main(String[] args) {

		LinkedHashSet lnkHashset = new LinkedHashSet();
	      lnkHashset.add(1);
	      lnkHashset.add(5);
	      lnkHashset.add(2);
	      lnkHashset.add(4);
	      lnkHashset.add(5);
	      lnkHashset.add(null);
	      displayAll(lnkHashset);
	      
	}
	public static void displayAll(Collection l)
	{
		Iterator i=l.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}

}
