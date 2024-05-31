import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int prod = 1;

        for(int i = 1; i <= n; i++){
            prod *= i;
            if(prod >= n){
                prod = i;
                System.out.println(prod);
                break;
            }
        }
    }
}