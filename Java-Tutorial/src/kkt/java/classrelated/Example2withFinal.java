package kkt.java.classrelated;

public final class Example2withFinal {
	
	public final String name;
	
	public final int age;

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	private Example2withFinal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public static Example2withFinal createObj(String nam,int ag)
	{
		return new Example2withFinal(nam, ag);
	}
	

}
