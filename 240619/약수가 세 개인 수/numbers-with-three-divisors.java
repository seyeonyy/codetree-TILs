import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        int ans_count = 0;

        for(int i = start; i <= end; i++){
            boolean count = false;
            for(int j = 2; j <= (int)Math.sqrt(i); j++){
                if(i % j == 0){
                    if(i == Math.pow(j,2)){
                        count = true;
                    }
                    break;
                }
            }
            if(count){
                ans_count++;
            }     
        }
        System.out.println(ans_count);
    }
}