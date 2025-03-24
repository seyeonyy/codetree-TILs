import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] arr = new int[N][N];
        int x = N/2;
        int y = N/2;
        int[] dx = new int[]{0, -1, 0, 1};
        int[] dy = new int[]{1, 0, -1, 0};
        int dirNum = 0;
        int moveNum = 1;
        int cnt = 1;
        while(cnt <= N*N){
            for (int j = 0; j < moveNum; j++) {
                if(!inRange(x, y, N)){
                    break;
                }
                arr[x][y] = cnt;
                cnt++;
                x += dx[dirNum];
                y += dy[dirNum];
            }
            dirNum = (dirNum + 1) % 4;
            if (dirNum % 2 == 0) {
                moveNum++;
            }
        }
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static boolean inRange(int x, int y, int N){
        return (0 <= x && x < N && 0 <= y && y < N);
    }
}