package kkt.java.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PriorityQueue queue=new PriorityQueue<>();
		queue.add("1");
		queue.add("3");
		queue.add("2");
		queue.add("4");
		queue.add("5");
		dispalyCollection(queue);
	}

	private static void dispalyCollection(Collection queue) {
		// TODO Auto-generated method stub
		Iterator i=queue.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}

}
