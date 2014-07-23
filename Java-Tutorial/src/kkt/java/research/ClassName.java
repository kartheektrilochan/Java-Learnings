package kkt.java.research;

import java.util.Date;

public class ClassName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		Date d=new Date();
		Float f;
		
		Integer i = 10;
		System.out.println(d.getClass());
		System.out.println(i.getClass());
		try {
			Class c=Class.forName("java.lang.String");
			System.out.println(c);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
