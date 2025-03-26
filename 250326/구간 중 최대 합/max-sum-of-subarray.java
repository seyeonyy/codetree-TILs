import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] arr = new int[N];
        for(int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
        }
        int ans = 0;
        for(int i = 0; i < N-K+1; i++){
            int sum = 0;
            for(int j = i; j < i+K; j++){
                sum += arr[j];
            }
            ans = Math.max(ans, sum);
        }
        System.out.println(ans);
    }
}