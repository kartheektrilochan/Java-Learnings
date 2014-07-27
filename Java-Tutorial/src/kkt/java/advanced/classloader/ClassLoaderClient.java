package kkt.java.advanced.classloader;

import java.lang.reflect.InvocationTargetException;

public class ClassLoaderClient {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		
		System.out.println("Starting Custom Class Loader");
		
		TrilochanCustomClassLoader cls=new TrilochanCustomClassLoader(ClassLoaderClient.class.getClassLoader());
		Class<?> clzClass=cls.loadClass("kkt.java.classrelated.Example");
		Object instance=clzClass.newInstance();
		clzClass.getMethod("displayName", String.class).invoke(instance, "kartheek");
	}	

}
