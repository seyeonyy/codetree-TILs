import java.util.Scanner;
public class Main {
    public static final int MAX_K = 1000*100;
    public static int[] tiles = new int[MAX_K*2+1];
    public static int cur = MAX_K;
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            int x = sc.nextInt();
            char c = sc.next().charAt(0);
            if(c == 'L'){
                while(x-- > 0){
                    tiles[cur] = 1;
                    if(x > 0){
                        cur--;
                    }
                }
            }else{
                while(x-- > 0){
                    tiles[cur] = 2;
                    if(x > 0){
                        cur++;
                    }
                }
            }
        }
        int cntW = 0;
        int cntB = 0;
        for(int i = 0; i < MAX_K*2+1; i++){
            if(tiles[i] == 1){
                cntW++;
            }
            if(tiles[i] == 2){
                cntB++;
            }
        }
        System.out.println(cntW + " " + cntB);
    }
}