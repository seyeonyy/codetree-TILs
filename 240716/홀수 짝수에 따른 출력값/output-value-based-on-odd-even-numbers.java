import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if(N % 2 == 0){
            System.out.println(evenSum(N));
        }else{
            System.out.println(oddSum(N));
        }
    }
    public static int evenSum(int n){
        if(n == 2){
            return 2;
        }
        return n + evenSum(n-2);  
    }
    public static int oddSum(int n){
        if(n == 1){
            return 1;
        }
        return n + oddSum(n-2);
    }
}