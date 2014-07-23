package kkt.java.research;

public class SubChildTest extends ChildTest {
	
	public SubChildTest() {
		System.out.println("this is in subchild test");
	}
	
	public static void main(String[] args) {
		
		ChildTest test=new SubChildTest();
		test.display("kartheek");
		
	}
	
	public void display(String name)
	{
		System.out.println("this si in disp method");
	}
}
