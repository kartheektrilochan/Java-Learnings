package kkt.self.casting;

public class DownCastingSub extends DownCastingSup{
	
	public void display()
	{
		System.out.println("this is in sub class display method");
	}

	public static void main(String[] args) {
		DownCastingSup sup=new DownCastingSub();
		if(sup instanceof DownCastingSub)
		{
			DownCastingSub sub=(DownCastingSub)sup;
			System.out.println("downcasting done");
		}
	}

}
