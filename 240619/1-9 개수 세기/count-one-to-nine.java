import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] arr2 = new int[9];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            arr2[arr[i]-1]++;
        }
        for(int i = 0; i < 9; i++){
            System.out.println(arr2[i]);
        }
    }
}