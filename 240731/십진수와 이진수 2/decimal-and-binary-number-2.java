import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        int num = 0;
        for(int i = 0; i < N.length(); i++){
            num = num * 2 + (N.charAt(i)-'0');
        }
        num *= 17;
        int[] digit = new int[20];
        int cnt = 0;
        while(true){
            if(num < 1){
                break;
            }
            digit[cnt++] = num % 2;
            num /= 2;
        }
        for(int i = cnt-1; i >= 0; i--){
            System.out.print(digit[i]);
        }
    }
}