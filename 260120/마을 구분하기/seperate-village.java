import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class Main {
    public static int n;
    public static int[][] grid;
    public static int[][] visited = new int[26][26];
    public static int[] dx = new int[]{1, 0, -1, 0};
    public static int[] dy = new int[]{0, 1, 0, -1};
    public static int cnt;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        grid = new int[n][n];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                grid[i][j] = sc.nextInt();
            }
        }

        ArrayList<Integer> villageSizes = new ArrayList<>();

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] == 1 && visited[i][j] == 0){
                    cnt = 0;
                    DFS(i, j);
                    villageSizes.add(cnt);
                }
            }
        }
        
        System.out.println(villageSizes.size());
        Collections.sort(villageSizes);
        for(int i = 0; i < villageSizes.size(); i++){
            System.out.println(villageSizes.get(i));
        }
    }

    public static boolean inRange(int x, int y){
        return 0 <= x && x < n && 0 <= y && y < n;
    }

    public static boolean canGo(int x, int y){
        if(!inRange(x, y)){
            return false;
        }
        if(grid[x][y] == 0 || visited[x][y] == 1){
            return false;
        }
        
        return true;
    }

    public static void DFS(int x, int y){
        visited[x][y] = 1;
        cnt++;
        for(int i = 0; i < 4; i++){
            int newX = x + dx[i];
            int newY = y + dy[i];
            if(canGo(newX, newY)){
                DFS(newX, newY);
            }
        }
    }
}