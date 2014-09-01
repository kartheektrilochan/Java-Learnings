package kkt.java.override;

import java.io.IOException;

public class ReturnTypeOverRideSubClass extends ReturnTypeOverRideSupClass{

	/**
	 * @param args
	 */
	public Customer display(String name)
	{
		System.out.println("This is in sub class");
		return new Customer();
	}

	
	public static void main(String[] args) throws IOException {
		ReturnTypeOverRideSupClass cls=new ReturnTypeOverRideSubClass();
		cls.display("kadadsa");
	}

}
