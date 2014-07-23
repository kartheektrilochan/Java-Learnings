package kkt.java.classrelated;

public final class ImmutableExample {

	/**
	 * @param args
	 */
	public final String name;
	
	public final int age;

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	private ImmutableExample(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public static ImmutableExample createInstance(int age,String name)
	{
		return new ImmutableExample(name, age);
		
	}
	
}
