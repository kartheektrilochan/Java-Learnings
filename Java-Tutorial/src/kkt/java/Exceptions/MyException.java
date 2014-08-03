package kkt.java.Exceptions;

public class MyException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	public MyException() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 * @param cause
	 */
	public MyException(String message, Throwable cause) {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 */
	public MyException(String message) {
		// TODO Auto-generated constructor stub
		System.out.println("Exception:"+message);
	}

	/**
	 * @param cause
	 */
	public MyException(Throwable cause) {
		// TODO Auto-generated constructor stub
	}
	
	
	

}
