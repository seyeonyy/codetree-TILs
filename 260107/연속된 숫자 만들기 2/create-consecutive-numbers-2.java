import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        // Please write your code here.
        int[] arr = new int[]{a, b, c};
        Arrays.sort(arr);
        int result = 2;

        if(arr[1] - arr[0] == 1 && arr[2] - arr[1] == 1){
            result = 0;
        }else if(arr[1] - arr[0] == 2 || arr[2] - arr[1] == 2){
            result = 1;
        }

        System.out.println(result);
    }
}