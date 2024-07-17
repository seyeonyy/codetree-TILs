import java.util.Scanner;
public class Main {
    public static int[] arr = new int[11];
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int a = arr[0];
        for(int i = 1; i < n; i++){
            a = lcm(a, arr[i]);
        }
        System.out.println(a);
    }
    public static int lcm(int a, int b){
        int gcd = gcd(a,b);
        return gcd * (a/gcd) * (b/gcd);
    }
    public static int gcd(int a, int b){
        int r = a % b;
        if(r == 0){
            return b;
        }
        return gcd(b, r);
    }
}