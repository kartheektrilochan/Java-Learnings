package kkt.java.serial.n.externalize.marker;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class CustomerExternalizableEx {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

		File f= new File("F:\\eclipse_kepler_workspace_all\\Java-Tutorial\\temp\\externalizable.txt");
		CustomerWithExter u= new CustomerWithExter();
		u.setAge(25);
		u.setName("kartherk");
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(f));
		out.writeObject(u);
		ObjectInputStream in = new ObjectInputStream(new FileInputStream(f));
		u=(CustomerWithExter)in.readObject();
		System.out.println("After de externalizing user name: " +u.getName()+" and age is:"+u.getAge()); 
	}

}
