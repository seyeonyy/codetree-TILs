import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        int num = 0;
        for(int i = 0; i < m; i++){
            if(i % 2 == 0){
                for(int j = 0; j < n; j++){
                    arr[j][i] = num++;
                }
            }else{
                for(int j = n-1; j >= 0; j--){
                    arr[j][i] = num++;
                }
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}