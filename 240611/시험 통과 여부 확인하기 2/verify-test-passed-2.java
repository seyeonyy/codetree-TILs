import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[4];
        int count = 0;
        for(int i = 0; i < n; i++){
            int sum = 0;
            for(int j = 0; j < 4; j++){
                arr[j] = sc.nextInt();
                sum += arr[j];
            }
            double avg = (double)sum / 4;
            if(avg >= 60){
                System.out.println("pass");
                count++;
            }else{
                System.out.println("fail");
            }
        }
        System.out.println(count);
    }
}