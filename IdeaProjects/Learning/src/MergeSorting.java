import java.util.Arrays;

public class MergeSorting {
    private static void merge(int[] arr, int[] left, int[] right) {
        int l = left.length, r = right.length;
        int i = 0, j = 0, k = 0;
        while (i < l && j < r) {
            if (left[i] > right[j]) {
                arr[k] = right[j];
                j++;
            } else {
                arr[k] = left[i];
                i++;
            }
            k++;
        }
        while (i < l) {
            arr[k] = left[i];
            k++;
            i++;
        }
        while (j < r) {
            arr[k] = right[j];
            k++;
            j++;
        }
    }

    private static void sort(int[] arr) {
        if (arr.length > 1) {
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
            System.out.println(Arrays.toString(left));
            sort(right);
            System.out.println(Arrays.toString(right));
            merge(arr, left, right);
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 3, 5, 7, 1, 2, 8, 9, 4, 6};
        sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}