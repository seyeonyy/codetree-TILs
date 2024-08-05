import java.util.Scanner;
public class Main {
    public static final int OFFSET = 1000;
    public static int[][] square1 = new int[OFFSET*2+1][OFFSET*2+1];
    public static int[][] square2 = new int[OFFSET*2+1][OFFSET*2+1];
    public static int x1;
    public static int y1;
    public static int x2;
    public static int y2;
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        x1 = sc.nextInt();
        y1 = sc.nextInt();
        x2 = sc.nextInt();
        y2 = sc.nextInt();
        for(int j = OFFSET+y1; j < OFFSET+y2; j++){
            for(int k = OFFSET+x1; k < OFFSET+x2; k++){
                square1[j][k] = 1;
            }
        }
        x1 = sc.nextInt();
        y1 = sc.nextInt();
        x2 = sc.nextInt();
        y2 = sc.nextInt();
        for(int j = OFFSET+y1; j < OFFSET+y2; j++){
            for(int k = OFFSET+x1; k < OFFSET+x2; k++){
                if(square1[j][k] == 1){
                    square2[j][k] = 2;
                    square1[j][k] = 0;
                    continue;
                }
                square2[j][k] = 1;
            }
        }
        int cnt1 = 0;
        int cnt3 = 0;
        int cnt2 = 0;
        for(int i = 0; i < OFFSET*2+1; i++){
            for(int j = 0; j < OFFSET*2+1; j++){
                if(square2[i][j] >= 1){
                    cnt2++;
                }
                if(square2[i][j] == 2){
                    cnt3++;
                }
                if(square1[i][j] == 1){
                    cnt1++;
                }
            }
        }
        if(cnt1 == 0){
            System.out.println(cnt1);
        }else if(cnt2+cnt3 > cnt1){
            cnt1 += cnt3;
            System.out.println(cnt1);
        }else{
            System.out.println(cnt1);
        }
    }
}