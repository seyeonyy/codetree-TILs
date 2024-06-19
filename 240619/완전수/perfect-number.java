import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        int cnt = 0;
        for(int i = start; i <= end; i++){
            int sum = 1;
            for(int j = 2; j <= (int)Math.sqrt(i); j++){
                if(i % j == 0){
                    if(j * j == i){
                        sum += j;
                    }else{
                        sum += i/j;
                        sum += j;
                    }
                }
            }
            if(sum == i){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}