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
        int share = 0;
        int remain = 0;
        for(int i = 10; i <= 100000; i*=10){
            if(n % 3 == 0){
                return true;
            }
            share = n / i;
            remain = n % i;
            if(share % 10 == 3 || share % 10 == 6 || share % 10 == 9){
                return true;
            }else if(remain % 10 == 3 || remain % 10 == 6 || remain % 10 == 9){
                return true;
            }

        }
        return false;
    }
}