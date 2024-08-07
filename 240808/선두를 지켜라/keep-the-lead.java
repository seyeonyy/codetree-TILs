import java.util.Scanner;
public class Main {
    public static final int MAX_T = 1000*1000;
    public static int[] N = new int[MAX_T+1];
    public static int[] M = new int[MAX_T+1];
    public static int v;
    public static int t;
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int loc1 = 0;
        int t1 = 0;
        for(int i = 0; i < n; i++){
            v = sc.nextInt();
            t = sc.nextInt();
            for(int j = t1+1; j <= t1+t; j++){
                N[j] = loc1+v;
                loc1+=v;
            }
            t1 += t;
        }
        int loc2 = 0;
        int t2 = 0;
        for(int i = 0; i < m; i++){
            v = sc.nextInt();
            t = sc.nextInt();
            for(int j = t2+1; j <= t2+t; j++){
                M[j] = loc2+v;
                loc2+=v;
            }
            t2 += t;
        }
        int count = 0;
        int cng = 0;
        if(N[1] > M[1]){
            cng = 1;
        }else if(N[1] < M[1]){
            cng = 2;
        }
        for(int i = 2; i <= t1; i++){
            if(N[i] > M[i]){
                if(cng == 2){
                    count++;
                    cng = 1;
                }
            }else if(N[i] < M[i]){
                if(cng == 1){
                    count++;
                    cng = 2;
                }
            }
        }
        System.out.println(count);
        
    }
}