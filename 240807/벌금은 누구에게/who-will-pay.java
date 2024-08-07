import java.util.Scanner;
public class Main {
    public static final int MAX_N = 10000;
    public static int[] arr = new int[MAX_N+1];
    public static int[] num = new int[MAX_N+1];
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        for(int i = 0; i < m; i++){
            arr[i] = sc.nextInt();
        }
        int idx = -1;
        for(int i = 0; i < m; i++){
            num[arr[i]]++;
        }
        for(int i = 1; i <= n; i++){
            if(num[i] >= k){
                idx = i;
                break;
            }
        }
        System.out.println(idx);
    }
}