import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Please write your code here.
        int max = Integer.MIN_VALUE;
        Arrays.sort(arr);
        int a = arr[0] * arr[1] * arr[n-1];
        int b = arr[n-1] * arr[n-2] * arr[n-3];
        
        max = Math.max(max, a);
        max = Math.max(max, b);
        System.out.println(max);
    }
}