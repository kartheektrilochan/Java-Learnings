package kkt.java.learnings.examples;

public class InstanceVariableValues {
	
	int a=20;
	

	public InstanceVariableValues(int a) {
		a +=6;
		System.out.println(a);
	}



	public static void main(String[] args) {

		InstanceVariableValues values=new InstanceVariableValues(10);
	}

}
