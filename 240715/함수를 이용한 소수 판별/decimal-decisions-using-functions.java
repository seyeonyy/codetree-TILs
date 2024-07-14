import java.util.Scanner;
public class Main {
    public static int[] arr = new int[100];
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print(isSum(a, b));
    }
    public static int isSum(int a, int b){
        int sum = 0;
        for(int i = a; i <= b; i++){
            if(isPrime(i)){
                sum += arr[i];
            }
        }
        return sum;
    }
    public static boolean isPrime(int num){
        for(int i = 2; i < num; i++){
            if(num % i == 0){
                return false;
            }
        }
        arr[num] = num;
        return true;
    }
}