import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] digits = new int[20];
        int cnt = 0;
        while(true){
            if(n < 2){
                digits[cnt++] = n;
                break;
            }
            digits[cnt++] = n % 2;
            n /= 2;
        }
        for(int i = cnt-1; i >= 0; i--){
            System.out.print(digits[i]);
        }
    }
}