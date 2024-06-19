import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 2; i <= n; i++){
            boolean count = true; 
            for(int j = 2; j <= (int)Math.sqrt(i); j++){
                if(i % j == 0){
                    count = false;
                    break;
                }
            }
            if(count){
                System.out.print(i + " ");
            }
        }
    }
}