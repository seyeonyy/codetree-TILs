import java.util.Scanner;
public class Main {
    public static final int INT_MIN = Integer.MIN_VALUE;
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int ans = INT_MIN;
        int max = 0;
        for(int i = 0; i < n-1; i++){
            for(int j = i+2; j < n; j++){
                max = arr[i] + arr[j];
                ans = Math.max(ans, max);
            }
        }
        System.out.println(ans);
    }
}