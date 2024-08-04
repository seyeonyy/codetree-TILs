import java.util.Scanner;
public class Main {
    public static final int OFFSET = 100;
    public static int[][] coloredPaper = new int[OFFSET*2+1][OFFSET*2+1];
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            for(int j = OFFSET+y; j <= OFFSET+y+7; j++){
                for(int k = OFFSET+x; k <= OFFSET+x+7; k++){
                    coloredPaper[j][k] += 1;
                }
            }
        }
        int cnt = 0;
        for(int i = 0; i < OFFSET*2+1; i++){
            for(int j = 0; j < OFFSET*2+1; j++){
                if(coloredPaper[i][j] >= 1){
                    cnt += 1;
                }
            }
        }
        System.out.println(cnt);
    }
}