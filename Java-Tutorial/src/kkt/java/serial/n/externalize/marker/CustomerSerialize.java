package kkt.java.serial.n.externalize.marker;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class CustomerSerialize {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customer=new Customer();
		customer.setAge(22);
		customer.setName("kartheek");
		try {
			FileOutputStream fio=new FileOutputStream(new File("F:\\eclipse_kepler_workspace_all\\Java-Tutorial\\temp\\abc.txt"));
			ObjectOutputStream obj=new ObjectOutputStream(fio);
			obj.writeObject(customer);
			obj.close();
			fio.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
