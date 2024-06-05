import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for(int i = 1; i <= a; i++){
            for(int j = 1; j <=b; j++){
                System.out.printf((i * j) + " ");
            }
            System.out.println();
        }
    }
}