import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        char n = sc.next().charAt(0);
        for(int i = 1; i <= 8; i++){
            System.out.print(n);
        }
    }
}