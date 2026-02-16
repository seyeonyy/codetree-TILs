import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
public class Main {
    public static int[] dx;
    public static int[] dy;
    public static Queue<Pair> q = new LinkedList<>();
    public static int n, m;
    public static int[][] grid;
    public static int[][] answer;
    public static int[][] visited;
    public static int x1;
    public static int y1;
    public static int can;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        grid = new int[n][m];
        answer = new int[n][m];
        visited = new int[n][m];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                grid[i][j] = sc.nextInt();
            }
        }
        push(0, 0);
        BFS();
        System.out.println(can);
    }

    public static void push(int x, int y){
        visited[x][y] = 1;
        q.add(new Pair(x, y));
    }
    public static void BFS(){
        dx = new int[]{0, 1, 0, -1};
        dy = new int[]{1, 0, -1, 0};
        
        while(!q.isEmpty()){
            Pair curr = q.poll();
            int x = curr.x;
            int y = curr.y;

            for(int i = 0; i < 4; i++){
                int newX = x + dx[i];
                int newY = y + dy[i];
                if(canGo(newX, newY)){
                    push(newX, newY);
                }
            }
        }
    }

    public static boolean inRange(int x, int y){
        return 0 <= x && x < n && 0 <= y && y < m;
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

    public static class Pair {
        int x, y;
        Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}