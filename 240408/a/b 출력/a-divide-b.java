import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int share = a / b;
        int remainder = a % b;
        for(int i = 1; i <= 21; i++){
            System.out.print(share);
            if(i == 1){
                System.out.print(".");
            }
            share = (remainder * 10) / b;            
            remainder = (remainder * 10) % b;
        }
    }
}