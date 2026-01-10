import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        // Please write your code here.
        int[] arr2 = new int[N];
        for(int i = 0; i < N; i++){
            arr2[i] = arr[i];
        }
        Arrays.sort(arr);
        int min = 101;
        for(int i = 0; i < N; i++){
            min = Math.min(min, arr[i]);
        }
        int min2 = 0;
        for(int i = 0; i < N; i++){
            if(arr[i] > min){
                min2 = arr[i];
                break;
            }
        }
        int cnt = 0;
        for(int i = 0; i < N; i++){
            if(arr2[i] == min2){
                cnt++;
            }
        }
        if(min2 == 0 || cnt > 1){
            System.out.println(-1);
        }else{
            int c = -1;
            for(int i = 0; i < N; i++){
                if(arr2[i] == min2){
                    c = i+1;
                    System.out.println(c);
                    break;
                }
            }
        }
    }
}