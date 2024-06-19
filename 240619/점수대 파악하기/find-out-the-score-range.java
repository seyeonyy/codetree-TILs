import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] count = new int[11];

        for(int i = 0; i < 100; i++){
            int n = sc.nextInt();
            if(n == 0){
                break;
            }
            if(n >= 10){
                count[n / 10]++;
            }
        }
        for(int i = 10; i > 0; i--){
            System.out.println(i+"0 - " + count[i]);
        }
    }
}