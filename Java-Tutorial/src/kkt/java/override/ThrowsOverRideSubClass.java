package kkt.java.override;

import java.io.IOException;

public class ThrowsOverRideSubClass extends ThrowsOverRideSupClass{

	/**
	 * @param args
	 */
	public void display(String name) throws IOException
	{
		System.out.println("This is in sub class");
	}

	
	public static void main(String[] args) throws Exception {
		ThrowsOverRideSupClass cls=new ThrowsOverRideSubClass();
		cls.display("kadadsa");
	}

}
