import java.util.Scanner;
public class Main {
    public static int n;
    public static int m;
    public static char d;
    public static int t;
    public static final int MAX_T = 1000 * 1000;
    public static int[] arr1 = new int[MAX_T+1];
    public static int[] arr2 = new int[MAX_T+1];
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        int t1 = 0;
        int t2 = 0;
        int cnt1 = 0;
        int cnt2 = 0;
        for(int i = 0; i < n; i++){
            d = sc.next().charAt(0);
            t = sc.nextInt();
            if(d == 'L'){
                for(int j = t1+1; j <= t1+t; j++){
                    cnt1--;
                    arr1[j] = cnt1;
                }
                t1 += t;
            }else{
                for(int j = t1+1; j <= t1+t; j++){
                    cnt1++;
                    arr1[j] = cnt1;
                }
                t1 += t;
            }
        }
        for(int i = 0; i < m; i++){
            d = sc.next().charAt(0);
            t = sc.nextInt();
            if(d == 'L'){
                for(int j = t2+1; j <= t2+t; j++){
                    cnt2--;
                    arr2[j] = cnt2;
                }
                t2 += t;
            }else{
                for(int j = t2+1; j <= t2+t; j++){
                    cnt2++;
                    arr2[j] = cnt2;
                }
                t2 += t;
            }
        }
        int max = 0;
        if(t1 > t2){
            max = t1;
        }else{
            max = t2;
        }
        int idx = -1;
        for(int i = 1; i <= max; i++){
            if(arr1[i] == arr2[i]){
                idx = i;
                break;
            }
        }
        System.out.println(idx);
    }
}