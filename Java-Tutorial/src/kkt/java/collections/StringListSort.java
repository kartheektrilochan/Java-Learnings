package kkt.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringListSort {

	public static void main(String[] args) {
		List<String> slist=new ArrayList();
		/*slist.add("Kartheek");
		slist.add("Kart");
		slist.add("Trilochan");
		slist.add("k");
		slist.add("K");
		slist.add("kar");
		*/
		slist.add("0001000");
		slist.add("1");
		slist.add("3");
		slist.add("12");
		slist.add("11");
		
		System.out.println(slist);
		Collections.sort(slist);
		System.out.println(slist);
		
	}

}
