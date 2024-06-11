import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        double[] arr = new double[8];
        double sum = 0;

        for(int i = 0; i < 8; i++){
            arr[i] = sc.nextDouble();
            sum += arr[i];
        }
        double avg = sum / 8;
        System.out.printf("%.1f", avg);
    }
}