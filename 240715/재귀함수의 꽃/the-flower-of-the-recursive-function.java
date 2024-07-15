import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        printNumber(N);
    }
    public static void printNumber(int n){
        if(n == 0){
            return;
        }
        System.out.print(n + " ");
        printNumber(n-1);
        System.out.print(n + " ");
    }
}