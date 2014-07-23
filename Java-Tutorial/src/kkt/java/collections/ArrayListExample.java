package kkt.java.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {

		List l=new ArrayList<>();
		l.add("a");
		l.add("b");
		l.add("c");
		l.add("d");
		l.add("e");
		
		displayList(l);
		displayCollection(l);
	}
	public static void displayList(List l)
	{
		System.out.println("Using List Interface");
		Iterator i=l.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		/*List temp=new LinkedList<>();
		temp=(List) l;
		temp.add(2,"kart");
		System.out.println(temp.size());
		i=temp.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	
*/	}
	public static void displayCollection(Collection l)
	{
		System.out.println("Using Collection Interface");
		Iterator i=l.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	
	}

}
