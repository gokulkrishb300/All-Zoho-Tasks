package rotation;

import java.util.Arrays;

import input.InputCenter;

public class Rotation {



	  static void reverse(int[] arr, int low , int high)
	    {
	        while(low < high)
	        {
	            int temp = arr[low];
	            arr[low] = arr[high];
	            arr[high] = temp;
	            low++;high--;
	        }
	    }
	    
	    static void rotate(int[] arr, int n , int d)
	    {
	    	  reverse(arr,0,n-1);
	        reverse(arr,0,d-1);
	      
	    }



	public static void main(String[] args) {

		InputCenter input = new InputCenter();

		int arraySize = input.getInt("arraySize : ");

		int[] arr = new int[arraySize];

		for (int i = 0; i < arraySize; i++) {
			arr[i] = input.getInt("");
		}
		int rotation = input.getInt("No.of rotation");

		Rotation.rotate(arr, arraySize, rotation);

		System.out.println(Arrays.toString(arr));
	}
}
