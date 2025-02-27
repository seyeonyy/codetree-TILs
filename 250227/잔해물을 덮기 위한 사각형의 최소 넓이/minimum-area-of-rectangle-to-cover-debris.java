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
        for(int i = ax1; i < ax2; i++){
            for(int j = ay1; j < ay2; j++){
                arr[i][j] = 1;
            }
        }
        for(int i = bx1; i < bx2; i++){
            for(int j = by1; j < by2; j++){
                if(arr[i][j] == 1){
                    arr[i][j] = 2;
                }else{
                    arr[i][j] = 3;
                }
            }
        }
        int cnt1 = 0;
        int cnt2 = 0;
        int cnt3 = 0;
        for(int i = 0; i < 2000; i++){
            for(int j = 0; j < 2000; j++){
                if(arr[i][j] == 1){
                    cnt1++;
                }
                if(arr[i][j] == 2){
                    cnt2++;
                }
                if(arr[i][j] == 3){
                    cnt3++;
                }
            }
        }
        if(cnt1 == 0){
            System.out.println(cnt1);
        }else if(cnt3 > cnt1){
            System.out.println(cnt1+cnt2);
        }else{
            System.out.println(cnt1);
        }
    }
}