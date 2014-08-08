package kkt.java.algorithms;

public class BubbleSortAlgorithm
{

	public static void bubble_srt(int array[]) {
		int n = array.length;
		int k;
		int temp;
		System.out.println("n:"+n);
		/* 4, 2, 9, 6, 23, 12, 34, 0, 1 */
		/*for (int m = n; m >= 0; m--) {
			for (int i = 0; i < n - 1; i++) 
			{
				k = i + 1;
				System.out.println("Comparing Elements are:"+array[i]+" "+array[k]);
				if (array[i] > array[k]) {
					//swapNumbers(i, k, array);
					temp = array[i];
					array[i] = array[k];
					array[k] = temp;
				}
			}
			printNumbers(array);
		}*/
		
		for(int i=0;i<n-1;i++)
		{
			 k=i+1;
			for(int j=0;j<n-1;j++)
			{
				System.out.println("Comparing Elements are:"+array[i]+" "+array[k]);
				if(array[j]>array[k])
				{
				temp = array[j];
				array[j] = array[k];
				array[k] = temp;
				}
			}
		}
		printNumbers(array);
		
	}
	/*private static void swapNumbers(int i, int j, int[] array) {

		int temp;
		temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
*/
	private static void printNumbers(int[] input) {
		
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i] + ", ");
		}
		System.out.println("\n");
	}

	public static void main(String[] args) {
		int[] input = { 4, 2, 9, 6, 23, 12, 34, 0, 1 };
		bubble_srt(input);

	}
}