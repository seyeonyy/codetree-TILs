import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] arr = new int[300][300];
        for(int i = 0; i < M; i++){
            int r = sc.nextInt()+100;
            int c = sc.nextInt()+100;
            arr[r][c] = 1;
            int cnt = 0;
            if(arr[r-1][c] == 1){
                cnt++;
            }
            if(arr[r][c-1] == 1){
                cnt++;
            }
            if(arr[r][c+1] == 1){
                cnt++;
            }
            if(arr[r+1][c] == 1){
                cnt++;
            }
            if(cnt == 3){
                System.out.println(1);
            }else{
                System.out.println(0);
            }
        }
    }
}