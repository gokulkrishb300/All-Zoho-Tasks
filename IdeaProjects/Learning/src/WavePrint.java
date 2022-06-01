public class WavePrint {
    public static void main(String[] args) {
        int N = 5, M = 4, count = 0;
        int[][] arr = new int[][]{{1, 2, 3, 4, 5},
                {16, 17, 18, 19, 6},
                {15, 24, 25, 20, 7},
                {14, 23, 22, 21, 8},
                {13, 12, 11, 10, 9}
        };
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < i + 1; j++) {
                if (i % 2 == 0) {
                    System.out.print(arr[j][N - 1 - i + j] + " ");
                } else {
                    System.out.print(arr[i  - j][N - j - 1] + " ");
                }
            }
        }
        for (int i = N-1; i >0; i--) {
            for (int j = 0; j < i - 1; j++) {
                if (i % 2 == 0) {
                    System.out.print(arr[N -1 - j][i-j-1] + " ");
                } else {
                    System.out.print(arr[N - j - 1][j] + " ");
                }
            }
        }
    }
}
