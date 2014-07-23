package kkt.java.research;

import java.lang.reflect.Field;

public class ProtoType {

	public static void main(String[] args) {
		try {
			String search1 = "name";
			SourceCustomer srccustomer = new SourceCustomer();
			srccustomer.setFirstname("kartheek");
			srccustomer.setPermenantadd("bangalore");
			DestinationCustomer dest = new DestinationCustomer();
			Class cls = DestinationCustomer.class;
			Field[] fields = cls.getDeclaredFields();
			int field_length = fields.length;
			System.out.println("size of fields is:" + fields.length);
			for (int i = 0; i < field_length; i++) {
				if (fields[i].getName().equals(search1)) {
					fields[i].setAccessible(true);
					srccustomer.getClass().getDeclaredField("firstname").setAccessible(true);
					srccustomer.getClass().getDeclaredField("permenantadd").setAccessible(true);
					fields[i].set(dest,srccustomer.getClass().getDeclaredField("firstname").get(srccustomer));
					System.out.println(fields[i].get(dest));
				}
			}
		} catch (IllegalArgumentException | IllegalAccessException
				| NoSuchFieldException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
