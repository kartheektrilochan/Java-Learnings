package kkt.java.override;

import java.io.IOException;

public class ReturnTypeOverRideSupClass {
	
	public Customer display(String name) 
	{
		System.out.println("This is in super class");
		return new Customer();
	}

}
