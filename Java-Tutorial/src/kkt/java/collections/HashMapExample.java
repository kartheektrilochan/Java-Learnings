package kkt.java.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
	
		 Map<String, Object> map1 = new HashMap();
	      map1.put("key1", "J");
	      map1.put("key2", "K");
	      map1.put("key3", "L");
	      map1.put("key4", "M");
	      map1.put("key4", null);
	      displayAll(map1.keySet());
	      displayAll(map1.values());
	      Iterator i=map1.entrySet().iterator();
	      while(i.hasNext())
	      {
	    	  Map.Entry pairs=(Map.Entry)i.next();
	    	  System.out.println(pairs.getKey() +" "+pairs.getValue());
	      }
	      for(Map.Entry map:map1.entrySet())
	      {
	      }
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
