import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 100; i++){
            int n = sc.nextInt();
            if(n == 0){
                break;
            }
            if(n % 2 == 1){
                n += 3;
            }else{
                n /= 2;
            }
            System.out.print(n + " ");
        }
    }
}