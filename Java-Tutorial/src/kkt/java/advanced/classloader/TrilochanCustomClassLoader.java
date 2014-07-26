/**
 * @author:trilochan
 */
package kkt.java.advanced.classloader;

import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/**
 * @author trilochan
 *
 */
public class TrilochanCustomClassLoader extends ClassLoader{
	public TrilochanCustomClassLoader(ClassLoader parent) {
		super(parent);
	}


	@Override
	public Class<?> loadClass(String name) throws ClassNotFoundException {
		System.out.println("Loading Class" +name +" .....");
		if (name.startsWith("kkt.java.classrelated.")) {
            return getClass(name);
        }
		return super.loadClass(name);
	}

	private Class<?> getClass(String name) {
		String file = name.replace('.', File.separatorChar)+ ".class";
	        System.out.println(file);
			byte[] b = null;
	        try {
	            // This loads the byte code data from the file
	            b = loadClassData(file);
	            // defineClass is inherited from the ClassLoader class
	            // and converts the byte array into a Class
	            Class<?> c = defineClass(name, b, 0, b.length);
	            resolveClass(c);
	            return c;
	        } catch (IOException e) {
	            e.printStackTrace();
	            return null;
	        }
	}

	private byte[] loadClassData(String name) throws IOException {
		
		InputStream stream = getClass().getClassLoader().getResourceAsStream(name);
	        int size = stream.available();
	        System.out.println(size);
	        byte buff[] = new byte[size];
	        StringBuilder stringBuilder = new StringBuilder(buff.length);
	        for(byte byteChar : buff) 
	        {
	           stringBuilder.append((char) byteChar);
	        }
	        System.out.println(stringBuilder);
	        DataInputStream in = new DataInputStream(stream);
	        // Reading the binary data
	        in.readFully(buff);
	        
	        StringBuffer inputLine = new StringBuffer();
	        String tmp;
	        while ((tmp = in.readLine()) != null) {
                inputLine.append(tmp);
                System.out.println("dada"+tmp);
            }
	        in.close();
	        return buff;
	}
	
	
	
}
