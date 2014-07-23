package kkt.java.clientapp;

import kkt.java.impl.ClassAImpl;

public class ClassAClient extends ClassAImpl{

	public ClassAClient() {
		super();
		System.out.println("this is in extended class");
		this.displayClass();
		
	}
	public static void main(String[] args) {
		ClassAImpl classaclient=new ClassAClient();
		classaclient.displayClass();
		ClassAClient aclient=new ClassAClient();
		System.out.println("this is the place where method is called in same class");
		aclient.aMethodInSameclass();
	}
	public void aMethodInSameclass()
	{
		this.displayClass();
	}
}
