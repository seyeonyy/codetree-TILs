import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] arr2 = new int[7];

        for(int i = 0; i < 10; i++){
            int n = sc.nextInt();
            arr2[n]++;
        }
        for(int i = 1; i <= 6; i++){
            System.out.println(i + " - " + arr2[i]);
        }
    }
}