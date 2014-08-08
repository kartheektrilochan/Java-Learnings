package kkt.java.collections;

public class DuplicatesinArray {

	public static void main(String[] args) {
		
		int[] a={3,5,6,3,1,2,1,1};
		int count=a.length;
		int k;
		int counter = 0;
		int[] barray;
		for(int i=0;i<count;i++)
		{
			/*System.out.println(a[i]);*/
			k=i+1;
			for(int j=0;j<count-1;j++)
			{
				if(a[k]==a[j])
				{
					counter++;
				}
				if(counter==0)
				{
					
				}
			}
			
		}
	}

}
