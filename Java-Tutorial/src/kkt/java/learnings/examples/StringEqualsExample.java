package kkt.java.learnings.examples;

public class StringEqualsExample {

	public static void main(String[] args) {
		String s1="Kartheek";
		String s2="Kartheek";
		String s3=s1;
		String s4=new String("Kartheek");
		System.out.println("S1 Hashcode:"+s1.hashCode());
		System.out.println("S2 Hashcode:"+s2.hashCode());
		System.out.println("S3 Hashcode:"+s3.hashCode());
		System.out.println("S3 Hashcode:"+s4.hashCode());
		System.out.println(s1==s2);
		System.out.println(s1==s4);
		System.out.println(s1.equals(s4));
	}

}
