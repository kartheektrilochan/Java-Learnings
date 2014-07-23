package kkt.java.research;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class CustomerReflection {

	public static void main(String[] args) {
		try {
			Customer customer=new Customer();
			Class cls = Customer.class;
			System.out.println(cls);
			Field field=cls.getField("publicfield");
			System.out.println(field);
			Method setmethod=cls.getMethod("setName",String.class);
			setmethod.invoke(customer, "hi");
			Method getmethod=cls.getMethod("getName", null);
			System.out.println(getmethod);
			String result=(String) getmethod.invoke(customer, null);
			System.out.println(result);
			System.out.println("*******************Alternative***************");
			Field dec_field1=cls.getDeclaredField("name");
			System.out.println("dec_field1"+dec_field1);
			dec_field1.setAccessible(true);
			dec_field1.set(customer, "kartheek");
			System.out.println(dec_field1.get(customer));
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
