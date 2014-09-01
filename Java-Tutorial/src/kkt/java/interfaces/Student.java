package kkt.java.interfaces;


public class Student implements Cloneable{

	private int age;
	private String studentname;
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	
	public Student(int age, String studentname) {
		super();
		this.age = age;
		this.studentname = studentname;
	}

	public static void main(String[] args) {
		Student st1=new Student(1, "kartheek");
		try {
			Student st2=(Student) st1.clone();
			Student st3=st2;
			System.out.println(st1);
			System.out.println(st2);
			st2.setAge(5);
			System.out.println(st2);
			System.out.println(st3);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

	@Override
	public String toString() {
		return "Student [age=" + age + ", studentname=" + studentname + "]";
	}
	
}
