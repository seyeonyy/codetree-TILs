import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        for(int i = 0; i < 10; i++){
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        for(int i = 1; i < 10; i+=2){
            sum += arr[i];
        }
        System.out.print(sum + " ");

        int sum2 = 0;
        int count = 0;
        for(int i = 2; i < 10; i += 3){
            sum2 += arr[i];
            count++;
        }
        double avg = (double)sum2/count;
        System.out.printf("%.1f", avg);
        
    }
}