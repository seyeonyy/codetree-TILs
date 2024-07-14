import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int cnt = 0;
        for(int i = a; i <= b; i++){
            if(isRemainNumber(i)){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
    public static boolean isRemainNumber(int n){
        if(n % 3 == 0){
            return true;
        }
        for(int i = 10; i <= 1000000; i*=10){
            if(n % 10 == 3 || n % 10 == 6 || n % 10 == 9){
                return true;
            }
            n /= 10;
        }
        return false;
    }
}