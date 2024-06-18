import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        int len = A.length();
        int n = 0;
        for(int i = 0; i < 100; i++){
            A = A.substring(len-1) + A.substring(0,len-1);
            n++;
            if(A.equals(B)){
                break;
            }
        }
        if(n == 100){
            System.out.print(-1);
        }else{
            System.out.print(n);
        }
    }
}