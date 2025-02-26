import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x1 = new int[n];
        int[] y1 = new int[n];
        int[] x2 = new int[n];
        int[] y2 = new int[n];
        int[][] arr = new int[210][210];
        for (int i = 0; i < n; i++) {
            x1[i] = sc.nextInt()+100;
            y1[i] = sc.nextInt()+100;
            x2[i] = sc.nextInt()+100;
            y2[i] = sc.nextInt()+100;
        }
        for(int i = 0; i < n; i++){
            for(int j = x1[i]; j < x2[i]; j++){
                for(int k = y1[i]; k < y2[i]; k++){
                    arr[j][k] = 1;
                }
            }
        }
        int cnt = 0;
        for(int i = 0; i < 210; i++){
            for(int j = 0; j < 210; j++){
                if(arr[i][j] == 1){
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
        // Please write your code here.
    }
}