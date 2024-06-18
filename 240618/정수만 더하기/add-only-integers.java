import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        int len = A.length();
        int sum = 0;
        for(int i = 0; i < len; i++){
            if('0' <= A.charAt(i) && A.charAt(i) <= '9'){
                int c = A.charAt(i) - '0';
                sum += c;
            }
        }
        System.out.print(sum);
    }
}