import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        int max = 1;
        int idx = 0;

        for(int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < N; i++){
            int count = 1;
            for(int j = 0; j < N; j++){
                if(arr[j] > max){
                    max = arr[j];
                    idx = j;
                }
            }
            for(int k = 0; k < N; k++){
                if(k != idx && arr[k] == max){
                    count++;
                }
                if(count >= 2){
                    max = -1;
                }
            }
        }
        System.out.println(max);
    }
}