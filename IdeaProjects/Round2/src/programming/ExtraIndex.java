package programming;
import sorting.MergeSorting;

public class ExtraIndex {
    private static void find(int num,int[] arr){

    }
    public static void main(String[] args) {
        int[] arr1={ 10, 20, 30, 12, 5 },arr2={ 10, 5, 30, 20 },arr3=new int[arr1.length],arr4=new int[arr2.length];
        for(int i=0;i<arr1.length;i++){
            arr3[i]=arr1[i];
            if(i<arr2.length){
                arr4[i]=arr2[i];
            }
        }
        MergeSorting obj=new MergeSorting();
        obj.sort(arr3);
        obj.sort(arr4);
        for(int i=0;i<arr1.length;i++){
            if(arr3[i]!=arr4[i]){
                System.out.println(find(arr3[i],arr1));
            }
        }
    }

}
