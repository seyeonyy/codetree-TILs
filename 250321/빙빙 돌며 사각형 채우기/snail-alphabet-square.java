import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        char[][] arr = new char[101][101];
        int x = 0;
        int y = 0;
        arr[x][y] = 'A';
        int[] dx = new int[]{0, 1, 0, -1};
        int[] dy = new int[]{1, 0, -1, 0};
        int dirNum = 0;
        for(int i = 1; i < N*M; i++){
            int nx = x + dx[dirNum];
            int ny = y + dy[dirNum];
            if(!inRange(nx, ny, N, M) || arr[nx][ny] != 0){
                dirNum = (dirNum+1)%4;
            }
            x += dx[dirNum];
            y += dy[dirNum];
            char num = (char)(65+i);
            arr[x][y] = num;
        }
        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static boolean inRange(int x, int y, int N, int M){
        return (0 <= x && x < N && 0 <= y && y < M);
    }
}