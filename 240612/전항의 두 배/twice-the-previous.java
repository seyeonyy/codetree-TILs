import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int A1 = sc.nextInt();
        int A2 = sc.nextInt();
        int[] arr = new int[10];
        arr[0] = A1;
        arr[1] = A2;

        for(int i = 2; i < 10; i++){
            arr[i] = arr[i - 1] + 2 * arr[i - 2];
        }
        for(int i = 0; i < 10; i++){
            System.out.print(arr[i] + " ");
        }
    }
}