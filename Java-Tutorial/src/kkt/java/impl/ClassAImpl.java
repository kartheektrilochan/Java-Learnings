package kkt.java.impl;

import kkt.java.interfaces.IClassA;


public class ClassAImpl implements IClassA {

	
	public ClassAImpl(){
		System.out.println("this is in parent class");
	}
	
	@Override
	public void displayClass() {
		System.out.println("This is in implementation class");
	}

	
}
