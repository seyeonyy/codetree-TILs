import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N+1];
        for(int i = 1; i <= N; i++){
            arr[i] = sc.nextInt();
        }
        int count = 0;
        for(int i = 1; i <= N; i++){
            int cnt = 1;
            for(int j = i; j <= N; j++){
                int sum = 0;
                sum += arr[j];
                int avg = sum / cnt;
                cnt++;
                for(int k = i; k <= j; k++){
                    if(avg == arr[k]){
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}