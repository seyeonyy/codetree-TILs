import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int cnt = 0;
        for(int i = 1; i <= N; i++){
            for(int j = 1; j <= N; j++){
                for(int k = 1; k <= N; k++){
                    if(Math.abs(a-i) <= 2 || Math.abs(b-j)<=2 || Math.abs(c-k)<=2){
                        cnt++;
                    }
                }
            }
        }
        System.out.println(cnt);
    }
}