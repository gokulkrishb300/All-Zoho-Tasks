public class Snake {
    static int N = 8, count = 1;

    private static void solve(int[] arr) {
        int check = arr[1], temp = 0;
        boolean var = false;
        for (int i = 0; i < N; i = i + 2) {
            if (check > arr[i]) {
                var = true;
            }
            if(){

            }
        }
        if (var) {
            temp = 30 - check;
            if (temp % 6 != 0) {
                count++;
            }
            count = count + (temp / 6);
        }

    }

    public static void main(String[] args) {
       /*Scanner obj=new Scanner(System.in);
        int N=obj.nextInt();
        int[] arr=new int[N*2];
        for(int i=0;i<N*2;i++){
            arr[i]=obj.nextInt();
        }*/
        int arr[] = {3, 22, 5, 8, 11, 26, 20, 29,
                17, 4, 19, 7, 27, 1, 21, 9};

        solve(arr);
    }
}
