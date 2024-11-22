import java.util.Scanner;
public class Main {
    public static final int INT_MAX = Integer.MAX_VALUE;
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
        }
        int ans = INT_MAX;
        for(int i = 0; i < N; i++){
            int minD = 0;
            int cnt = 0;
            for(int j = i; j < N; j++){
                minD += arr[j] * cnt;
                cnt += 1;
            }
            for(int j = 0; j < i; j++){
                minD += arr[j] * cnt;
                cnt += 1;
            }
            ans = Math.min(ans, minD);
        }
        System.out.println(ans);
    }
}