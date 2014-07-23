package kkt.java.nestedclasses;

public class InnerClassA {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		InnerClassA classAobj=new InnerClassA();
		InnerClassA.B bobj=classAobj.new B();
		bobj.display("kartheek");
	}
	class B {
		//static int i;
		void display(String name)
		{
			System.out.println("Name is called:"+name);
		}
	}

}
