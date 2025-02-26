import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int a = 11;
        int b = 11;
        int c = 11;
        int cnt = 0;
        if(A <= a && B <= b && C < c){
            System.out.println(-1);
        }else{
            while(true){
                if(a == A && b == B && c == C){
                    break;
                }
                c++;
                cnt++;
                if(c == 60){
                    c = 0;
                    b++;
                }
                if(b == 24){
                    b = 0;
                    a++;
                }
            }
            System.out.println(cnt);
        }
    }
}