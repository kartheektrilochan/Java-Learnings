package kkt.java.research;

public class MapNCode {

	private String name;
	private String value;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}



	public void setValue(String value) {
		this.value = value;
	}



	public static void main(String[] args) {
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>");
		MapNCode code=new MapNCode();
		code.setValue("1");
		code.setName("name");
		MapNCode code1=new MapNCode();
		code1.setValue("1");
		code1.setName("name");
		MapNCode code2=new MapNCode();
		code2=code1;
		boolean val=code1.equals(code2);
		System.out.println(val);
	}

}
