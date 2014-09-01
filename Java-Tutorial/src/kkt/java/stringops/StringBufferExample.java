package kkt.java.stringops;

public class StringBufferExample {

	public static void main(String[] args) {
		String s="Kartheek Trilochan";
		StringBuffer buffer=new StringBuffer(s);
		buffer.append("assafs");
		System.out.println(buffer);
		buffer.insert(5, buffer);
		System.out.println(buffer);
		buffer.replace(5, 10, "/as");
		System.out.println(buffer);
		StringBuffer reverse=new StringBuffer(s);
		System.out.println(reverse.reverse());
	}

}
