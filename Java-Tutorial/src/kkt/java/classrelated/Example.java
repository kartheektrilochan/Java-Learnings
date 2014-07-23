package kkt.java.classrelated;

public final class Example {
	
	public static final String name="Kartheek";
	
	private String age;
	
	
	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public void displayName(String name){
		System.out.println("This is a method in final class:"+Example.name);
	}
	
	public static void main(String[] args) {
		Example eg=new Example();
		eg.displayName("asd");
	}

}
