package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Array {


    private static void rotate(int[] arr, int low , int high)
    {
        while(low < high)
        {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;high--;
        }
    }
    
    private static void left(int[] arr, int arrayLength, int rotation)
    {
    	  rotate(arr,0,rotation-1);
    	  rotate(arr,rotation,arrayLength-1);
     	  rotate(arr,0,arrayLength-1);
    }
    
    private static void right(int[] arr, int arrayLength, int rotation)
    {
    	  rotate(arr,0,arrayLength-1);
    	  rotate(arr,0,rotation-1);
    	  rotate(arr,rotation,arrayLength-1);
    }
    
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in); 
       
     
            int arrayLength = sc.nextInt();
            int rotation = sc.nextInt();
            int[] array = new int[arrayLength];

           for(int i = 0 ; i < arrayLength ; i++)
           {
        	   array[i] = sc.nextInt();
           }
            
           System.out.println(array[arrayLength-(rotation%arrayLength)]);
           
//            for(int i = arrayLength-rotation ; i < arrayLength ; i++)
//            {
//            	System.out.print(array[i]+" ");
//            }
//            
//            for(int i = 0 ; i < arrayLength-rotation ; i++)
//            {
//            	System.out.print(array[i]+" ");
//            }
//            System.out.println();
//            
//            for(int i = rotation ; i < arrayLength ; i++)
//            {
//            	System.out.print(array[i]+" ");
//            }
//            
//            for(int i = 0 ; i < rotation ; i++)
//            {
//            	System.out.print(array[i]+" ");
//            }
        sc.close();
}
}