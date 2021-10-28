/**Write a function to rotate an array (Reversal technique)
 * 
 * Input: Array, Rotation_Count
 * Output: Rotated array
 * **/

package servegit.algorithms;

public class ArrayRotation {

	
	public static void main(String[] args)
	{
		
		int[] arr = new int[] {1 ,2 ,3, 4 ,5, 6, 7, 8};
		display(arr);
		rotate(arr, 16);
		
		display(arr);
	
	}
	
	private static void rotate(int[] arr, int k) {
		
		int rotations = k%(arr.length);
		if(rotations == 0)
			return;
		reverse(arr, 0 , arr.length -1);
		reverse(arr, 0, rotations-1);
		reverse(arr, rotations, arr.length -1);
		
	}

	private static void display(int[] arr)
	{
		System.out.println();
		for(int i=0;i< arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
			
	}
	
	private static void reverse(int[] arr, int low, int high)
	{
		for(int i=low, k=high; i<=(low+high)/2 ; i++,k--)
		{
			int temp = arr[i];
			arr[i] = arr[k];
			arr[k] = temp;
		}
	}
	
	
	
}
