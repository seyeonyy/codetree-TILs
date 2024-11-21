import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        char[][] arr = new char[R][C];
        for(int i = 0; i < R; i++){
            for(int j = 0; j < C; j++){
                arr[i][j] = sc.next().charAt(0);
            }
        }
        int count = 0;
        for(int i = 1; i < R; i++){
            for(int j = 1; j < C; j++){
                for(int k = i+1; k < R-1; k++){
                    for(int l = j+1; l < C-1; l++){
                        if(arr[0][0] != arr[i][j] && arr[i][j] != arr[k][l] && arr[k][l] != arr[R-1][C-1]){
                            count++;
                        }
                    }
                }
            }
        }
        System.out.println(count);
    }
}