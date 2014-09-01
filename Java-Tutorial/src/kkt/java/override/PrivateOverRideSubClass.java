package kkt.java.override;

import java.io.IOException;

public class PrivateOverRideSubClass extends PrivateOverRideSupClass{

	/**
	 * @param args
	 */
	public void display(String name)
	{
		System.out.println("This is in sub class");
	}

	
	public static void main(String[] args) {
		PrivateOverRideSubClass cls=new PrivateOverRideSubClass();
		cls.display("kadadsa");
	}

}
