import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] arr = new int[200][200];
        for(int i = 0; i < N; i++){
            int x = sc.nextInt()+100;
            int y = sc.nextInt()+100;
            for(int j = x; j < x+8; j++){
                for(int k = y; k < y+8; k++){
                    arr[j][k] += 1;
                }
            }
        }
        int cnt = 0;
        for(int i = 0; i < 200; i++){
            for(int j = 0; j < 200; j++){
                if(arr[i][j] >= 1){
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}