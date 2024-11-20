import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] arr = new int[N][N];
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int max = 0;
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N-2; j++){
                max = Math.max(max, arr[i][j] + arr[i][j+1] + arr[i][j+2]);
            }
        }
        System.out.println(max);
    }
}