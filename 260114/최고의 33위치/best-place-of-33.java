import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int max = 0;
        for(int i = 0; i <= n-3; i++){
            int cnt = 0;
            for(int j = i; j < i+3; j++){
                for(int k = i; k < i+3; k++){
                    if(arr[j][k] == 1){
                        cnt++;
                    }
                }
            }
            max = Math.max(max, cnt);
        }
        System.out.println(max);
    }
}