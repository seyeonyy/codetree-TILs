import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        printString(N);
    }
    public static void printString(int N){
        for(int i = 0; i < N; i++){
            System.out.println("12345^&*()_");
        }
    }
}