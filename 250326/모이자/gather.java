import java.util.Scanner;
public class Main {
    public static final int INT_MAX = Integer.MAX_VALUE;
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
        }
        int ans = INT_MAX;
        for(int i = 0; i < N; i++){
            int dist = 0;
            for(int j = 0; j < N; j++){
                dist += Math.abs(i-j) * arr[j];
            }
            if(dist < ans){
                ans = dist;
            }
        }
        System.out.println(ans);
    }
}