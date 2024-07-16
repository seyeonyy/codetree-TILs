import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int cnt = 0;
        for(int i = a; i <= b; i++){
            if(isRemainNumber(i) || i % 3 == 0){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
    public static boolean isRemainNumber(int n){
        int remain = 0;
        while(n != 0){
          remain = n % 10;
          if(remain == 3 || remain == 6 || remain == 9){
            return true;
          }
          n /= 10;
        }
        return false;
    }
}