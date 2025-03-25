import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int T = sc.nextInt();
        int cnt = 1;
        int[][] arr = new int[N][N];
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                arr[i][j] = cnt++;
            }
        }
        String s = sc.nex;
        int[] dx = new int[]{0, 1, 0, -1};
        int[] dy = new int[]{1, 0, -1, 0};
        int dirNum = 3;
        int x = N/2;
        int y = N/2;
        int sum = arr[x][y];
        for(int i = 0; i < T; i++){
            if(s.charAt(i) == 'R'){
                dirNum = (dirNum+1)%4;
            }else if(s.charAt(i) == 'L'){
                dirNum = (dirNum+3)%4;
            }else{
                int nx = x + dx[dirNum];
                int ny = y + dy[dirNum];
                if(!inRange(nx, ny, N)){
                    continue;
                }
                x += dx[dirNum];
                y += dy[dirNum];
                sum += arr[x][y];
            }
        }
        System.out.println(sum);
    }
    public static boolean inRange(int x, int y, int N){
        return (0 <= x && x < N && 0 <= y && y < N);
    }
}