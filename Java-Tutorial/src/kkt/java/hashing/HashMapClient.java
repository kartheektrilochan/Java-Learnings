package kkt.java.hashing;

import java.util.HashMap;
import java.util.Map;

public class HashMapClient {

	public static void main(String[] args) {
		HashMapClient client1=new HashMapClient();
		HashMapClient client2=new HashMapClient();
		HashMapClient client3=new HashMapClient();
		System.out.println("client1:"+client1.hashCode());
		System.out.println("client2:"+client2.hashCode());
		System.out.println("client3:"+client3.hashCode());
		
		HashPojo pojo1=new HashPojo();
		HashPojo pojo2=new HashPojo();
		HashPojo pojo3=new HashPojo();
		
		System.out.println("pojo1:"+pojo1.hashCode());
		System.out.println("pojo2:"+pojo2.hashCode());
		System.out.println("pojo3:"+pojo3.hashCode());
		
		HashMap<Object, String> hashmap=new HashMap<>();
		hashmap.put(pojo1, "hi");
		hashmap.put(pojo2, "hi");
		
//		Map.Entry<Object, String> map=(Entry<Object, String>) hashmap.entrySet();
		for(Map.Entry<Object, String> map:hashmap.entrySet())
		{
			System.out.println(map.getKey()+" "+map.getValue());
		}
		
	}

/*	@Override
	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub
		return super.equals(arg0);
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
*/
	@Override
	public String toString() {
		System.out.println("this is called");
		return super.toString();
	}
	
	

}
