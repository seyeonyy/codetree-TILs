import java.util.Scanner;
public class Main {
    public static final int OFFSET = 1000;
    public static int[][] square1 = new int[OFFSET*2+1][OFFSET*2+1];
    //public static int[][] square2 = new int[OFFSET*2+1][OFFSET*2+1];
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
                square1[j][k] += 1;
            }
        }
        x1 = sc.nextInt();
        y1 = sc.nextInt();
        x2 = sc.nextInt();
        y2 = sc.nextInt();
        for(int j = OFFSET+y1; j < OFFSET+y2; j++){
            for(int k = OFFSET+x1; k < OFFSET+x2; k++){
                square1[j][k] += 2;
            }
        }
        /*for(int i = OFFSET-1; i < OFFSET+11; i++){
            for(int j = OFFSET-1; j < OFFSET+11; j++){
                System.out.println(i + " " + j + " " +square1[i][j]);
            }
        }*/
        int cnt1 = 0;
        int cnt2 = 0;
        for(int i = 0; i < OFFSET*2+1; i++){
            for(int j = 0; j < OFFSET*2+1; j++){
                if(square1[i][j] == 1){
                    cnt1++;
                }
                if(square1[i][j] == 3){
                    cnt2++;
                }
            }
        }
        if(cnt1 < cnt2){
            cnt1 = cnt1;
        }else if(cnt1 > cnt2){
            cnt1 += cnt2;
        }else{
            cnt1-= cnt2;
        }
        System.out.println(cnt1);
    }
}