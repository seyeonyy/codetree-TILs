import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int ans = 0;
        for(int i = X; i <= Y; i++){
            String numberStr = String.valueOf(i);
            char[] digits = numberStr.toCharArray();
            int sum = 0;
            for(int j = 0; j < digits.length; j++){
                sum += digits[j]-'0';
            }
            ans = Math.max(ans, sum);
        }
        System.out.println(ans);
    }
}