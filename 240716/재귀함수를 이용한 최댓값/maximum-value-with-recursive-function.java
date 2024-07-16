import java.util.Scanner;
public class Main {
    public static int n = 0;
    public static int[] numbers = new int[100];
    public static int max = numbers[n];
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int num = 0;
        for(int i = 1; i <= n; i++){
            numbers[i] = sc.nextInt();
        }
        System.out.println(maxNum(n));
    }
    public static int maxNum(int n){
        if(numbers[n] > max){
            max = numbers[n];
        }
        if(n == 1){
            return max;
        }
        return maxNum(n-1);
    }
}