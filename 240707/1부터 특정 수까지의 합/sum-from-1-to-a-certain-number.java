import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(sum(N));
    }
    public static int sum(int N){
        int num = 0;
        for(int i = 1; i <= N; i++){
            num += i;
        }
        return num / 10;
    }
}