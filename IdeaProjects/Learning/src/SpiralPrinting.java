public class SpiralPrinting {
    public static void main(String[] args) {
        int N = 5,M=4,count=0;
        int[][] arr = new int[][]{  {1, 2, 3, 4},
                                    {16, 17, 18, 19},
                                    {15, 24, 25, 20},
                                    {14, 23, 22, 21},
                                    {13, 12, 11, 10}
        };
        int row_start = 0, col_start = 0, row_end = N, col_end = M;

        while (row_start<=row_end && col_start<=col_end) {
            for (int i = col_start; i < col_end; i++) {
                System.out.print(arr[row_start][i] + " ");
                count++;
            }
            row_start++;
            for (int j = row_start; j < row_end; j++) {
                System.out.print(arr[j][col_end - 1] + " ");
                count++;
            }
            col_end--;
            for (int k = col_end - 1; k >= col_start; k--) {
                System.out.print(arr[row_end - 1][k] + " ");
                count++;
            }
            row_end--;
            for (int l = row_end - 1; l >=row_start; l--) {
                System.out.print(arr[l][col_start] + " ");
                count++;
            }
            col_start++;

        }
    }
}
