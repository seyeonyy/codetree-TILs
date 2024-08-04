import java.util.Scanner;
public class Main {
    public static int x1;
    public static int y1;
    public static int x2;
    public static int y2;
    public static final int OFFSET = 100;
    public static int first = OFFSET;
    public static int[][] square1 = new int[2*OFFSET+1][2*OFFSET+1];
    //public static int[][] square2 = new int[OFFSET+1][OFFSET+1];
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            x1 = sc.nextInt();
            y1 = sc.nextInt();
            x2 = sc.nextInt();
            y2 = sc.nextInt();
            for(int j = first+x1; j <= first+x2-1; j++){
                for(int k = first+y1; k <= first+y2-1; k++){
                    square1[k][j] += 1;
                }
            }
        }
        int cnt1 = 0;
        int cnt2 = 0;
        for(int i = 0; i < 2*OFFSET+1; i++){
            for(int j = 0; j < 2*+OFFSET+1; j++){
                if(square1[i][j] == 1){
                    cnt1++;
                }
                if(square1[i][j] > 1){
                    cnt2++;
                }
            }
        }
        System.out.print(cnt1 + cnt2);
    }
}