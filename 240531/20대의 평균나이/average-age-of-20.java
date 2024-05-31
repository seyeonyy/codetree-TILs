import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        double avg = 0;
        int count = 0;
        while(true){
            int age = sc.nextInt();
            count++;
            if(age >= 30){
                break;
            }
            sum += age;
            avg = (double)sum / count;
        }
        System.out.printf("%.2f", avg);
    }
}