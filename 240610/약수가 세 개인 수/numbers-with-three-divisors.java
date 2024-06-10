import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        int ans_count = 0;

        for(int i = start; i <= end; i++){
            int count = 0;
            for(int j = 1; j <= start; j++){
                if(i % j == 0){
                    count++;
                }
            }
            if(count == 3){
                ans_count++;
            }     
        }
        System.out.println(ans_count);
    }
}