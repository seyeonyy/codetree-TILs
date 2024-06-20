import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[100][100];
        int num = 1;
        int idx = 0;
        while(idx != n+m-1){
            for(int x = 0; x < n; x++){
                for(int y = 0; y < m; y++){
                    if(x+y == idx){
                        arr[x][y] = num++;
                    }
                }
            }
            idx++;
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        } 
    }
}