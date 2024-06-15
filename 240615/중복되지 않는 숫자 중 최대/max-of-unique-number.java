import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N+1];
        int idx = 0;
        int max = 0;

        for(int i = 0; i < N; i++){
            idx = sc.nextInt();
            arr[idx]++;
        }
        max = -1;
        for(int i = N; i > 0; i--){
            if (arr[i] == 1){
                max = i;
                break;
            }
        }
        System.out.println(max);
    }
}