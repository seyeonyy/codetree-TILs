import java.util.Scanner;
public class Main {
    public static int cnt = 0;
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int cnt = 0;
        System.out.println(count(N, cnt));
    }
    public static int count(int n, int cnt){
        if(n == 1){
            return cnt;
        }
        cnt++;
        if(n % 2 == 0){
            n /= 2;
        }else{
            n /= 3;
        }
        return count(n, cnt);
    }
}