package sorting;

public class MergeSorting {
    private static void merge(int[] arr,int[] left,int[] right){
        int i=0,j=0,k=0,l=left.length,r=right.length;
        while(i<l && j<r){
            if(left[i]>right[j]){
                arr[k]=right[j];
                j++;
            }
            else{
                arr[k]=left[i];
                i++;
            }
            k++;
        }
        while(i<l){
            arr[k]=left[i];
            i++;
            k++;
        }
        while(j<r){
            arr[k]=right[j];
            j++;
            k++;
        }
    }
   public static void sort(int[] arr){
        if(arr.length>1) {
            int mid = arr.length / 2;
            int[] left = new int[mid];
            int[] right = new int[arr.length - mid];
            for (int i = 0; i < mid; i++) {
                left[i] = arr[i];
            }
            for (int i = 0; i < arr.length - mid; i++) {
                right[i] = arr[mid + i];
            }
            sort(left);
            sort(right);
            merge(arr, left, right);
        }
   }
}
