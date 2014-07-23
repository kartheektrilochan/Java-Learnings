package kkt.java.nestedclasses;

public class NestedMainClass {
	
	private String name;
	int oute_x=100;
	void test(){
		
		NestedSubClass sub=new NestedSubClass();
		sub.display();
		sub.val="hi";
	}
public class NestedSubClass{
	private String val;
	
	void display(){
		System.out.println("this is inner class:"+oute_x+name);
		name="1000";
	}
}
}
