import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;
class Pair{
    int x;
    int y;
    public Pair(int x, int y){
        this.x = x;
        this.y = y;
    }
}
public class Main {
    public static int n;
    public static int k;
    public static int[][] grid;
    public static int[][] starts;
    public static int[] dx;
    public static int[] dy;
    public static Queue<Pair> q = new LinkedList<>();
    public static int count;
    public static boolean[][] visited;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        grid = new int[n][n];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                grid[i][j] = sc.nextInt();
            }
        }
        starts = new int[k][2];
        for (int i = 0; i < k; i++) {
            starts[i][0] = sc.nextInt();
            starts[i][1] = sc.nextInt();
        }
        visited = new boolean[n][n];

        for(int i = 0; i < k; i++){
            q.add(new Pair(starts[i][0]-1, starts[i][1]-1));
            BFS();
        }
        System.out.println(count);
        
    }

    public static boolean canGo(int x, int y){
        return inRange(x, y) && visited[x][y] == false && grid[x][y] == 0;
    }

    public static boolean inRange(int x, int y){
        return 0 <= x && x < n && 0 <= y && y < n;
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
                    q.add(new Pair(newX, newY));
                    visited[newX][newY] = true;
                    count++;
                }
            }
        }
    }
}