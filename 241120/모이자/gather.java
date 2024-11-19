import java.util.Scanner;
public class Main {
    public static final int INT_MAX = Integer.MAX_VALUE;
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] arr2 = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            arr2[i] = arr[i];
        }
        int minD = INT_MAX;
        for(int i = 0; i < n; i++){
            arr[i] *= i;
            int c = 0;
            int minSum = 0;
            for(int j = i+1; j < n; j++){
                c+= 1;
                arr[j] *= c;
                minSum += arr[j];
            }
            c = 0;
            for(int j = i-1; j >= 0; j--){
                c += 1;
                arr[j] *= c;
                minSum += arr[j];
            }
            minD = Math.min(minD, minSum);
            for(int j = 0; j < n; j++){
                arr[j] = arr2[j];
            }
        }
        System.out.println(minD);
    }
}