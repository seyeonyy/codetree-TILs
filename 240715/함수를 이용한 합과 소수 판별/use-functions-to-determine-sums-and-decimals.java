import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(findNumber(a, b));
    }
    public static int findNumber(int a, int b){
        int cnt = 0;
        for(int i = a; i <= b; i++){
            if(isPrime(i) && isEven(i)){
                cnt++;
            }
        }
        return cnt;
    }
    public static boolean isPrime(int n){
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static boolean isEven(int n){
        int sum = 0;
        while(n != 0){
            sum += n % 10;
            n /= 10;
        }
        if(sum % 2 == 0){
            return true;
        }
        return false;
    }
}