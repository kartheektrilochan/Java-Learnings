package kkt.java.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set s=new TreeSet<>();
		s.add(1);
		s.add(31);
		s.add(5);
		s.add(8);
		s.add(8);
		//s.add(null);
		displayList(s);
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
