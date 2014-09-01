package kkt.java.learnings.examples;

import com.sun.org.apache.regexp.internal.recompile;

public class CovatiantReturnTypeSUBExample extends CovatiantReturnTypeSUPExample{
	
	public CovatiantReturnTypeSUBExample display()
	{
		System.out.println("This is in sub class with covariant return type");
		return new CovatiantReturnTypeSUBExample();
	}

	public static void main(String[] args) {
		CovatiantReturnTypeSUPExample example=new CovatiantReturnTypeSUBExample();
		example.display();
	}
	
}
