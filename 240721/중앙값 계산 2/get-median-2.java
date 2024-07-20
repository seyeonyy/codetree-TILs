import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            if(i % 2 == 0){
                int[] arr2 = new int[i+1];
                for(int j = 0; j <= i; j++){
                    arr2[j] = arr[j];
                }
                Arrays.sort(arr2);
                System.out.print(arr2[i/2] + " ");
            }
        }
    }
}