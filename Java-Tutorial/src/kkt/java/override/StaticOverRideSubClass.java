package kkt.java.override;

import java.io.IOException;

public class StaticOverRideSubClass extends StaticOverRideSupClass{

	/**
	 * @param args
	 */
	public static void display(String name)
	{
		System.out.println("This is in sub class");
	}

	
	public static void main(String[] args) throws IOException {
		StaticOverRideSupClass cls=new StaticOverRideSubClass();
		cls.display("kadadsa");
	}

}
