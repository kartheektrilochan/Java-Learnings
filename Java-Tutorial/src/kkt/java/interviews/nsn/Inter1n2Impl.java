package kkt.java.interviews.nsn;

public class Inter1n2Impl implements Interface1,Interface2 {

	public static void main(String[] args) {

		Interface1 inter1=new Inter1n2Impl();
		inter1.method1();
	}

	@Override
	public void method1() {
		System.out.println("This is method 1:");
		
	}


}
