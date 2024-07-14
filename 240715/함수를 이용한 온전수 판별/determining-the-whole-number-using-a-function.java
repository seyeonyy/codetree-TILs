import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int cnt = 0;
        for(int i = a; i <= b; i++){
            if(number(i)){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
    public static boolean number(int num){
        if(num % 2 != 0 && num % 10 != 5 && !(num % 3 == 0 && num % 9 != 0)){
            return true;
        }
        return false;
    }
}