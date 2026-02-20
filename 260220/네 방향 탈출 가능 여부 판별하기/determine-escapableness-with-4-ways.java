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
    public static int m;
    public static int[][] grid;
    public static boolean[][] visited;
    public static Queue<Pair> q = new LinkedList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        grid = new int[n][m];
        visited = new boolean[n][m];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                grid[i][j] = sc.nextInt();
            }
        }
        q.add(new Pair(0, 0));
        visited[0][0] = true;
        BFS();
        if(visited[n-1][m-1]){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }

    public static boolean canGo(int x, int y){
        return inRange(x, y) && grid[x][y] == 1 && visited[x][y] == false;
    }

    public static boolean inRange(int x, int y){
        return 0 <= x && x < n && 0 <= y && y < m;
    }

    public static void BFS(){
        int[] dx = new int[]{0, 1, 0, -1};
        int[] dy = new int[]{1, 0, -1, 0};
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
                }
            }
        }
    } 
}