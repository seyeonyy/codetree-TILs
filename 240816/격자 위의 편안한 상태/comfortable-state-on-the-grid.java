import java.util.Scanner;
public class Main {
    public static int n;
    public static int m;
    public static int[] dx = {1, 0, -1, 0};
    public static int[] dy = {0, 1, 0, -1};
    public static int[][] arr = new int[101][101];
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        for(int i = 0; i < m; i++){
            int cnt = 0;
            int r = sc.nextInt();
            int c = sc.nextInt();
            r-=1;
            c-=1;
            arr[r][c] = 1;
            for(int dirNum = 0; dirNum < 4; dirNum++){
                int nx = r+dx[dirNum];
                int ny = c+dy[dirNum];
                if(inRange(nx, ny) && arr[nx][ny] == 1){
                    cnt++;
                }
            }
            if(cnt == 3){
                System.out.println(1);
            }else{
                System.out.println(0);
            }
        }
    }
    public static boolean inRange(int x, int y){
        return 0 <= x && x < n && 0 <= y && y < n;
    }
}