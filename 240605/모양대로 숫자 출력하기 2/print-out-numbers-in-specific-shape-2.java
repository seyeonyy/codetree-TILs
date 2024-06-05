import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 1;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print((2*cnt)+ " ");
                cnt++;
                if(cnt >= 5){
                    cnt = 1;
                }
            }
            System.out.println();
        }
    }
}