import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;
        while(true){
            if(N % 2 == 0){
                N /= 2;
            } else if(N == 1){
                break;
            } else{
                N = N * 3 + 1;
            }
            count++;
        }
        System.out.println(count);
    }
}