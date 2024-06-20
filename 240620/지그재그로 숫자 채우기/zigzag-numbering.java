import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        int num = 0;
        int x = 0;
        int y = 0;
        while(y != m){
            if(x == n-1){
                for(int j = 0; j < n; j++){
                    arr[x][y] = num++;
                    x--;
                    if(x == -1){
                        x = 0;
                    }
                }
                y++;
            }else{
                for(int j = 0; j < n; j++){
                    arr[x][y] = num++;
                    x++;
                    if(x == n){
                        x = n-1;
                    }
                }
                y++;
            }
        }
        /*for(int i = 0; i < m; i++){
            if(x == n-1){
                for(int j = 0; j < n; j++){
                    arr[x][y+i] = num++;
                    x--;
                    if(x == -1){
                        x = 0;
                    }
                }
            }else{
                for(int j = 0; j < n; j++){
                    arr[x][y+i] = num++;
                    x++;
                    if(x == n){
                        x = n-1;
                    }
                }
            }
        }*/
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}