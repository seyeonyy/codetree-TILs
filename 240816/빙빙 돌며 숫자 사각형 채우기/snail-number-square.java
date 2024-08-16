import java.util.Scanner;
public class Main {
    public static int n;
    public static int m;
    public static int[] dx = {0, 1,  0, -1};
    public static int[] dy = {1, 0, -1, 0};
    public static int[][] arr = new int[101][101];
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        int x = 0;
        int y = 0;
        int dirNum = 0;
        arr[x][y] = 1;
        for(int i = 2; i <= n*m; i++){
            int nx = x + dx[dirNum];
            int ny = y + dy[dirNum];
            if(!inRange(nx, ny) || arr[nx][ny] != 0){
                dirNum = (dirNum + 1) % 4;
            }
            x = x + dx[dirNum];
            y = y + dy[dirNum];
            arr[x][y] = i;
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static boolean inRange(int x, int y){
        return 0<= x && x < n && 0 <= y && y < m;
    }
}