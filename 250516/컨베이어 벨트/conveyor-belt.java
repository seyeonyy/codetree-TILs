import java.util.Scanner;
public class Main {
    public static int N;
    public static int[][] arr;
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        int T = sc.nextInt();
        arr = new int[N][N];
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < N; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        while(T > 0){
            int temp = arr[1][N-1];
            int temps = arr[0][N-1];
            for(int i = 0; i < 2; i++){
                for(int j = N-1; j >= 1; j--){
                    arr[i][j] = arr[i][j-1];
                }
            }
            arr[0][0] = temp;
            arr[1][0] = temps;
            T--;
        }
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < N; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}