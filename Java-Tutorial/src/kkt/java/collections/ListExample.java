package kkt.java.collections;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is a list example");
		List list=new ArrayList();
		list.add(1);
		list.add(2);
		list.add(2);
		list.add(2);
		list.add(0);
		list.add(-1);
		
		Collection c=new ArrayList();
		c.add("kartheek");
		
		//Collections.sort(list);
		HashSet set=new HashSet<>();
		set.addAll(list);
		list.clear();
		list.addAll(set);
		System.out.println("LIST:"+list);
		System.out.println("Collection:"+c);
		System.out.println("HashSet:"+set);
	}

}
