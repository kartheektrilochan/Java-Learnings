package kkt.java.Exceptions;

public class ExceptionsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExceptionsExample eg=new ExceptionsExample();
		try {
			eg.testException();
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void testException() throws MyException  {
		String name="Kartheek";
		if(name.equalsIgnoreCase("KARTHEEK"))
		{
			try {
				System.out.println("ere");
				throw new MyException(name);
			} catch (MyException e) {
				System.out.println("here");
				throw new MyException(name);
			}
		}
	}

}
