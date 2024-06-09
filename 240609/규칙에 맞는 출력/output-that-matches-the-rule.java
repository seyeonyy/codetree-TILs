import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = n; i > 0; i--){
            for(int j = i; j <= n; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}