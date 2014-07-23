package kkt.java.research;

import java.util.StringTokenizer;

public class StringOperations {

	public static void main(String[] args) {

		String input="kartheek,trilochan";
		StringTokenizer st=new StringTokenizer(input,",");
		System.out.println(st);
		
		while(st.hasMoreElements())
		{
			System.out.println(st.nextElement());
		}
		
		String a="kartheek trilochan";
		String b="kartheek trilochan";
		System.out.println(a.equals(b));
	}

}
