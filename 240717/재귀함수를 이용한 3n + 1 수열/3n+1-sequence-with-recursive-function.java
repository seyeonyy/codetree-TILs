import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(count(n));
    }
    public static int count(int n){
        if(n == 1){
            return 0;
        }
        if(n % 2 == 0){
            return count(n/2) + 1;
        }else{
            return count(n*3+1) + 1;
        }
    }
}