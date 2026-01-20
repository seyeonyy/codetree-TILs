import java.util.Scanner;
public class Main {
    public static int[][] visited = new int[101][101];
    public static int[] dx = new int[]{1, 0};
    public static int[] dy = new int[]{0, 1};
    public static int n;
    public static int m;
    public static int[][] grid;
    public static int can = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        grid = new int[n][m];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                grid[i][j] = sc.nextInt();
            }
        }

        DFS(0, 0);
        System.out.println(can);
    }

    public static boolean canGo(int x, int y){
        if(!inRange(x, y)){
            return false;
        }
        if(visited[x][y] == 1 || grid[x][y] == 0){
            return false;
        }
        if(x == n-1 && y == m-1){
            can = 1;
        }
        return true;
    }

    public static boolean inRange(int x, int y){
        return 0 <= x && x < n && 0 <= y && y < m;
    }

    public static void DFS(int x, int y){
        visited[x][y] = 1;
        for(int i = 0; i < 2; i++){
            int newX = x + dx[i];
            int newY = y + dy[i];
            if(canGo(newX, newY)){
                DFS(newX, newY);
            }
        }
    }
}