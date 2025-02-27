import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[2000][2000];
        int ax1 = sc.nextInt()+1000;
        int ay1 = sc.nextInt()+1000;
        int ax2 = sc.nextInt()+1000;
        int ay2 = sc.nextInt()+1000;
        int bx1 = sc.nextInt()+1000;
        int by1 = sc.nextInt()+1000;
        int bx2 = sc.nextInt()+1000;
        int by2 = sc.nextInt()+1000;
        int cnt = 0;
        for(int i = ax1; i < ax2; i++){
            for(int j = ay1; j < ay2; j++){
                arr[i][j] = 1;
                cnt++;
            }
        }
        int cnt2 = 0;
        for(int i = bx1; i < bx2; i++){
            for(int j = by1; j < by2; j++){
                if(arr[i][j] == 1){
                    arr[i][j] = 2;
                    cnt2++;
                }else{
                    arr[i][j] = 3;
                }
            }
        }
        if(cnt == cnt2){
            System.out.println(0);
        }
        else if(bx1 < ax1 && bx2 > ax2 && by1 > ay1 && by2 > ay2){
            System.out.println(cnt - cnt2);
        }else{
            System.out.println(cnt);
        }
        
    }
}