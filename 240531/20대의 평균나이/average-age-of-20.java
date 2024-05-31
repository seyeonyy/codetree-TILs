import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        double avg = 0;
        int count = 1;
        while(true){
            int age = sc.nextInt();
            if(age >= 30){
                break;
            }
            sum += age;
            avg = (double)sum / count;
            count++;
        }
        System.out.printf("%.2f", avg);
    }
}