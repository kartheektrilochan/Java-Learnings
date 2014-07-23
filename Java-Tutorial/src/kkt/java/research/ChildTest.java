package kkt.java.research;

public class ChildTest extends ParentClass{

	public ChildTest() {
		System.out.println("this is in child test constructor");
	}
	
	public static void main(String[] args) {
		ChildTest test=new ChildTest();
		System.out.println(ParentClass.name);

	}
	
	public void display(String name)
	{
		System.out.println("this is in childtest class");
	}

}
