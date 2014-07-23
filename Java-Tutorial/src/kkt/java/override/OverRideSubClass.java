package kkt.java.override;

import java.io.IOException;

public class OverRideSubClass extends OverRideSupClass{

	/**
	 * @param args
	 */
	public void display(String name)
	{
		System.out.println("This is in sub class");
	}

	
	public static void main(String[] args) {
		OverRideSupClass cls=new OverRideSubClass();
		try {
			cls.display("kadadsa");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
