import java.util.Scanner;
public class Main {
    public static int n;
    public static int[][] arr;
    public static int[] dx = new int[]{0, 1, 0, -1};
    public static int[] dy = new int[]{1, 0, -1, 0};
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int count = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                int cnt = 0;
                for(int dirNum = 0; dirNum < 4; dirNum++){
                    int nx = i + dx[dirNum], ny = j + dy[dirNum];
                    if(inRange(nx, ny) && arr[nx][ny] == 1){
                        cnt++;
                    }
                }
                if(cnt >= 3){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
    public static boolean inRange(int x, int y){
        return (0 <= x && x < n && 0 <= y && y < n);
    }
}