package kkt.self.casting;

public class CastingSub extends CastingSUP{
	
	public void display()
	{
		System.out.println("this is in sub class display method");
	}

	public static void main(String[] args) {
		CastingSUP supref=new CastingSub();
		CastingSub sub=new CastingSub();
		CastingSUP sup=new CastingSUP();
		if(sup instanceof CastingSub){
			System.out.println("instance of ");
		}
		else
		{
			System.out.println("not an instance");
		}
		
	}

}
