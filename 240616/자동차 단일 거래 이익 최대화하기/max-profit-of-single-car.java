import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int idx = 0;

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int max = 0;
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                if(arr[j]-arr[i] > max){
                    max = arr[j] - arr[i];
                }
            }
        }
        System.out.print(max);
    }
}