import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 2; i <= n; i++){
            int count = 0;
            for(int j = 1; j <= i; j++){
                if(i % j == 0){
                    count++;
                }
            }
            if(count == 2){
                System.out.print(i + " ");
            }
        }
    }
}