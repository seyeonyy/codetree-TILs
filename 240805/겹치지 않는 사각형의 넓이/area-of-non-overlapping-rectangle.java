import java.util.Scanner;
public class Main {
    public static final int OFFSET = 1000;
    public static int[][] AB = new int[2*OFFSET+1][2*OFFSET+1];
    public static int[][] M = new int[2*OFFSET+1][2*OFFSET+1];
    public static int x1;
    public static int x2;
    public static int y1;
    public static int y2;
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 2; i++){
            x1 = sc.nextInt();
            y1 = sc.nextInt();
            x2 = sc.nextInt();
            y2 = sc.nextInt();
            for(int j = OFFSET+y1; j <= OFFSET+y2-1; j++){
                for(int k = OFFSET+x1; k <= OFFSET+x2-1; k++){
                    AB[j][k] += 1;
                }
            }
        }
        x1 = sc.nextInt();
        y1 = sc.nextInt();
        x2 = sc.nextInt();
        y2 = sc.nextInt();
        for(int j = OFFSET+y1; j <= OFFSET+y2-1; j++){
            for(int k = OFFSET+x1; k <= OFFSET+x2-1; k++){
                M[j][k] = 1;
            }
        }
        int cnt = 0;
        for(int i = 0; i < OFFSET*2+1; i++){
            for(int j = 0; j < OFFSET*2+1; j++){
                if(AB[i][j] == 1 && M[i][j] != 1){
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}