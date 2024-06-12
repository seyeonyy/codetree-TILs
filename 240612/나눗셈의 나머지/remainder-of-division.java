import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int i = 0;
        int[] arr = new int[10];
        int sum = 0;

        while(a > 1){
            i = a % b;
            arr[i]++;
            a /= b;
        }

        for(int j = 0; j < 10; j++){
            sum += arr[j] * arr[j];
        }
        System.out.println(sum);
    }
}