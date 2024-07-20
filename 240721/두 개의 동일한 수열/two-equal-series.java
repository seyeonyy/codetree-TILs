import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] A = new Integer[n];
        Integer[] B = new Integer[n];
        for(int i = 0; i < n; i++){
            A[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            B[i] = sc.nextInt();
        }
        Arrays.sort(A);
        Arrays.sort(B);
        int count = 0;
        while(count != n){
            if(A[count] != B[count]){
                System.out.println("No");
                break;
            }
            count++;
        }
        if(count == n){
            System.out.println("Yes");
        }
    }
}