import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int count = 1;
        while(true){
            int n = sc.nextInt();
            if(n % 2 == 0){
                n = n / 2;
                System.out.println(n);
                if(count >= 3){
                    break;
                }
                count++;
            }
        }
    }
}