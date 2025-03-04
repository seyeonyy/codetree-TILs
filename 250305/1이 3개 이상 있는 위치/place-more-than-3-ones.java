import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] arr = new int[N][N];
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int x = 0;
        int y = 0;
        int[] dx = new int[]{0, 1, 0, -1};
        int[] dy = new int[]{1, 0, -1, 0};
        int count = 0;
        for(int i = 0; i < N*N; i++){
            int cnt = 0;
            if(y == N){
                y = 0;
                x += 1;
            }
            for(int j = 0; j < 4; j++){
                int nx = x + dx[j];
                int ny = y + dy[j];
                if(inRange(nx, ny, N) && arr[nx][ny] == 1){
                    cnt++;
                }
            }
            if(cnt >= 3){
                count++;
            }
            y+=1;
        }
        System.out.println(count);
    }
    public static boolean inRange(int x, int y, int N){
        return(0 <= x && x < N && 0 <= y && y < N);
    }

    
}