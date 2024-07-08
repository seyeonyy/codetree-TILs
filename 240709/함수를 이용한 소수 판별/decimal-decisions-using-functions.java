import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print(isPrime(a, b));
    }
    public static int isPrime(int a, int b){
        int sum = 0;
        int k = 0;
        if(a != 1 && b != 1){
            for(int i = a; i <= b; i++){
                k = i;
                for(int j = 2; j < i; j++){
                    if(i % j == 0){
                        k = 0;
                        break;
                    }
                }
            sum += k;
            }
        }
        return sum;
    }
}