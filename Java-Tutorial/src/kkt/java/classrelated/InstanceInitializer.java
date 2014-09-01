package kkt.java.classrelated;

import sun.net.www.content.text.plain;

public class InstanceInitializer {

	int x;
	static{
		System.out.println("inside static block");
		displayStatic();
	}
	{
		x=100000;
		System.out.println("This is in instance intializeed block");
		display();
		displayStatic();
	}
	public static void displayStatic(){
		System.out.println("inside static method");
	}
	
	public InstanceInitializer(int x) {
		System.out.println("inside construcotr1:"+x);
		this.x=x;
		System.out.println("inside construcotr2:"+x);
	}
	
	InstanceInitializer(){
		System.out.println("default Construcotr:"+x);
	}
	
	void display()
	{
		System.out.println("This is in display method:"+x);
	}
	public static void main(String[] args) {
		System.out.println("main Mehtod");
		InstanceInitializer initialize=new InstanceInitializer();
		InstanceInitializer initialize1=new InstanceInitializer(10);
		initialize1.display();
	}

}
