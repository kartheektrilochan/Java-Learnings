package kkt.java.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {

		List linkedlist=new LinkedList<>();
		linkedlist.add("kartheek");
		linkedlist.add("trilochan");
		linkedlist.add("abc");
		displayList(linkedlist);
		
	}
	public static void displayList(List l)
	{
		Iterator i=l.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		List temp=new LinkedList<>();
		temp=(List) l;
		temp.add(2,"kart");
		System.out.println(temp.size());
		i=temp.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	
	}

}
