package kkt.java.research;

public class InstanceOfTest {

	public static void main(String[] args) {
		InstanceOfTest instance=new InstanceOfTest();
		Object obj=instance.new SubTest();
		if(obj instanceof InstanceOfTest)
		{
			InstanceOfTest testobj=(InstanceOfTest)obj;
			System.out.println("obj is instance of Instance of test");
		}
		else
		{
			System.out.println("obj is not an instance of Instance of test");
		}
	}
	public class SubTest{
		
	}
}
