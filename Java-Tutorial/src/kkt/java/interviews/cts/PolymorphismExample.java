package kkt.java.interviews.cts;

public class PolymorphismExample {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		CTSSubClass sub=new CTSSubClass();
		System.out.println(sub.someMethod("kartheek"));
		CTSSuperClass sup=new CTSSuperClass();
		System.out.println(sup.someMethod("trilochan"));
		CTSSuperClass supsub=new CTSSubClass();
		System.out.println(supsub.someMethod("kartheek trilochan"));
	}

}
