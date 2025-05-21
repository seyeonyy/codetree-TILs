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
        double sum = 0.0;
        double cnt = 0.0;
        double avg = 0.0;
        for(int i = 1; i <= N; i++){
            sum = 0;
            cnt = 0;
            for(int j = i; j <= N; j++){
                sum += arr[j];
                cnt++;
                avg = sum / cnt;
                for(int k = i; k <= j; k++){
                    if(avg == arr[k]){
                        count++;
                        break;
                    }
                }
            }
        }
        System.out.println(count);
    }
}