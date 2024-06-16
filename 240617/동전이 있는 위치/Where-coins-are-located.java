import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n+1][n+1];

        for(int i = 0; i < m; i++){
            int r = sc.nextInt();
            int c = sc.nextInt();
            arr[r][c] = 1;
        }
        for(int i = 1; i < n+1; i++){
            for(int j = 1; j < n+1; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}