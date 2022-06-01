package absolute;

import input.InputCenter;

public class Absolute {
	
//	private int subset(int[] arr , int size)
//	{
//		int sum = 0;
//	}
	
	private static int Mathabs(int value)
	{
	
		if(value < 0)
		{
			return -(value);
		}
		return value;
	}
	private boolean absolute(int[] arr, int size , int sum)
	{	
		for(int i = 0 ; i < size ; i++)
		{
			for(int j = 0 ; j < size ; j++)
			{
				if(Mathabs(arr[i])-Mathabs(arr[j])== sum)
				{
					return true;
				}
			}
		}
		return false;
		
	}
	
	public static void main(String[] args)
	{
		
		InputCenter input = new InputCenter();
		
		Absolute diff = new Absolute();
		
        int arraySize = input.getInt("arraySize : ");
		
		int[] arr = new int[arraySize];
		
		for(int i = 0 ; i < arraySize ;i++)
		{
			arr[i] = input.getInt("");
		}
		int sum = input.getInt("sum : ");
		
		System.out.println(diff.absolute(arr, arraySize, sum));
	}
	
}
