import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        // Please write your code here.
        int cnt = 0;
        int swap = 0;
        if(a <= b && a != b-1){
            a = b+1;
            swap = a;
            a = b;
            b = swap;
            cnt++;
        }
        if(c != b+1){
            c = b+1;
            cnt++;
        }
        if(cnt == 1){
            System.out.println(0);
        }else{
            System.out.println(cnt);
        }
    }
}