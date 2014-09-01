package kkt.java.classrelated;

public class AbstractionTest extends AbstractCoreStructure{

	public int add()
	{
		System.out.println("in local method");
		System.out.println(x-y);
		return x-y;
	}
	public static void main(String[] args) {
		AbstractCoreStructure core=new AbstractionTest();
		core.x=10;
		core.y=11;
		core.add();
		core.display();
	}

	@Override
	public void display() {
		System.out.println("This is in implementation");
	}

}
