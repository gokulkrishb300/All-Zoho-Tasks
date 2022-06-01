public class Test1 {
    static int N = 4;

    private static boolean isSafe(int[][] maze, int x, int y) {
        return (x >= 0 && x < N && y >= 0 && y < N && maze[x][y] == 1);
    }

    private static boolean solve(int[][] maze, int x, int y, int[][] sol) {
        if (x == N - 1 && y == N - 1 && maze[x][y]==1) {
            sol[x][y] = 1;
            return true;
        }
        if (isSafe(maze, x, y)) {
            System.out.println(x + " " + y);
            if (sol[x][y] == 1) {
                return false;
            }
            sol[x][y] = 1;
            if (solve(maze, x + 1, y, sol)) {
                System.out.println("1");
                return true;
            }
            if (solve(maze, x - 1, y, sol)) {
                System.out.println("2");
                return true;
            }
            if (solve(maze, x, y - 1, sol)) {
                System.out.println("3");
                return true;
            }
            if (solve(maze, x, y - 1, sol)) {
                System.out.println("4");
                return true;
            }
            sol[x][y] = 0;
            return false;
        }
        return false;
    }

    public static void main(String[] args) {
        int x = 0, y = 0;
        int[][] maze = {{1, 0, 0, 0},
                {1, 1, 0, 1},
                {0, 1, 1, 0},
                {1, 1, 1, 1}};
        int[][] sol = new int[N][N];
        solve(maze, x, y, sol);
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(sol[i][j] + " ");
            }
            System.out.println();
        }
    }
}
