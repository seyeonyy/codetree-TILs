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
        for(int i = 0; i < R; i++){
            int cnt = 0;
            int x = 0;
            int y = 0;
            for(int j = 0; j < C; j++){
                for(int k = i+1; k < R; k++){
                    for(int l = j+1; l < C; l++){
                        if(k == R-1 && l == C-1){
                            if(cnt == 2){
                                count++;
                            }
                        }
                        if(k - x >= 1 && l - y >= 1 && arr[x][y] != arr[k][l]){
                            cnt++;
                            x = k;
                            y = l;
                        }
                    }
                }
            }
        }
        System.out.println(count);
    }
}