package kkt.java.learnings.examples;

public class HashCodeClassB {
	public int value;

	public int hashCode() {
		return (int)(value^5);
	}


}
