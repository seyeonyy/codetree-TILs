import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        printNumber1(N);
        System.out.println();
        printNumber2(N);
    }
    public static void printNumber1(int n){
        if(n == 0){
            return;
        }
        printNumber1(n-1);
        System.out.print(n + " ");
    }
    public static void printNumber2(int n){
        if(n == 0){
            return;
        }
        System.out.print(n + " ");
        printNumber2(n-1);
    }
}