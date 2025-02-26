import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        // Please write your code here.
        int cnt = 0;
        while(!(a == c && b == d)){
            b += 1;
            cnt++;
            if(b == 60){
                b = 0;
                a += 1;
            }
        }
        System.out.println(cnt);
    }
}