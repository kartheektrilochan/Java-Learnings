package kkt.java.research;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import kkt.java.impl.ClassAImpl;

public class ClassTraverser {

	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		System.out.println("--Starting the class traverser--");
		Method[] methods=ClassAImpl.class.getDeclaredMethods();
		System.out.println(methods.length);
		for(int i=0;i<methods.length;i++)
		{
			System.out.println(methods[i].getName());
		}
		methods[0].invoke(new ClassAImpl(), args);
	}

}
