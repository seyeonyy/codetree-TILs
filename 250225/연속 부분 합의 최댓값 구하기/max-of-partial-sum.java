import java.util.Scanner;
public class Main {
    public static final int INT_MIN = Integer.MIN_VALUE;
    public static int n;
    public static int[] dp;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        dp = new int[n+1];
        initialize();
        dp[0] = nums[0];
        for(int i = 1; i < n; i++){
            dp[i] = Math.max(dp[i-1]+nums[i], nums[i]);
        }
        /*for(int i = 0; i < n; i++){
            System.out.println(dp[i]);
        }*/
        int max = INT_MIN;
        for(int i = 0; i < n; i++){
            max = Math.max(max, dp[i]);
        }
        System.out.println(max);
    }
    public static void initialize(){
        for(int i = 0; i < n; i++){
            dp[i] = INT_MIN;
        }
    }
}