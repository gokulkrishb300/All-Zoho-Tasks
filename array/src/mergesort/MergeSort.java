package mergesort;

import java.util.Arrays;

public class MergeSort {
	
	static void mergeSort(int[] A,int lb,int ub)
	{
		if(lb<ub)
		{
		int	mid = (lb+ub)/2;
			mergeSort(A,lb,mid);
			mergeSort(A,mid+1,ub);
			merge(A,lb,mid,ub);
		}
	}
	
	static void merge(int[] a,int lb,int mid,int ub)
	{
		int i = lb;
		int j = mid+1;
		int k = lb;
		int[] b = new int[a.length];
		while(i <= mid && j <=ub)
		{
			if(a[i] <=a[j])
			{
				b[k] = a[i];
				i++;
			}
			else {
				b[k] = a[j];
				j++;
			}
			k++;
		}
		if(i > mid)
		{
			while(j <= ub)
			{
				b[k] = a[j];
				j++;k++;
			}
		}
		else
		{
			while(i<=mid)
			{
				b[k] = a[i];
				i++;k++;
			}
		}
		
		for(k = lb; k <=ub ; k++)
		{
			a[k] = b[k];
		}
	}
	
	public static void main(String[] args)
	{
		int[] a = {12,11,13,96,105,2,54,32,5,6,7};
		
		mergeSort(a,0,a.length-1);
		
		System.out.println(Arrays.toString(a));
	}
    }