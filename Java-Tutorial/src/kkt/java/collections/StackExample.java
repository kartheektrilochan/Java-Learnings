package kkt.java.collections;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {

		Stack st=new  Stack();
		st.push(1);
		st.push(2);
		st.push(4);
		System.out.println(st);
		st.pop();
		System.out.println(st);
	}

}
