import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int prod = 2;
        int x = 1;
        while(true){
            prod *= 2;
            x++;
            if(prod == n){
                break;
            }
        }
        System.out.println(x);
    }
}