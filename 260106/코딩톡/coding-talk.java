import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int p = sc.nextInt();
        char[] c = new char[M];
        int[] u = new int[M];
        for (int i = 0; i < M; i++) {
            c[i] = sc.next().charAt(0);
            u[i] = sc.nextInt();
        }
        // Please write your code here.
        char[] arr = new char[N+1];
        for(int i = 1; i <= N; i++){
            char uppercaseChar = (char) ('A' + (i - 1));
            arr[i] = uppercaseChar;
        }

        char[] arr2 = new char[N+1];
        for(int i = 0; i < M; i++){
            if(i+1 < p){
                arr2[i] = c[i];
            }else{
                arr2[i] = 0;
            }
        }
        Arrays.sort(c);
        for(int i = 0; i < M-1; i++){
            for(int j = i+1; j < i+2; j++){
                if(c[i] == c[j]){
                    c[j] = 0;
                }
            }
        }
        Arrays.sort(c);
        
        for(int i = 1; i <= N; i++){
            char b = arr[i];
            boolean found = false;
            for(int j = 0; j < M; j++){
                if(c[j] != 0 && arr[i] == c[j]){
                    found = true;
                    break;
                }
            }
            if (!found) {
                arr2[i] = b;
            }
        }

        for(int i = 0; i < N; i++){
            if(arr2[i] != 0){
                System.out.print(arr2[i] + " ");
            }
        }

    }
}