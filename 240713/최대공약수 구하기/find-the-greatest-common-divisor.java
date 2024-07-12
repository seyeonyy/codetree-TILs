import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        gcd(n, m);
    }
    public static void gcd(int n, int m){
        int num = 1;
        int num2 = 1;
        if(n > m){
            while(num != 0){
                num = n % m;
            }
            System.out.print(m);
        }else{
            while(num != 0){
                num = m % n;
            }
            System.out.print(n);
        }
    }
}