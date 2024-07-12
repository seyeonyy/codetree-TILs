import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        findLcm(n, m);
    }
    public static void findLcm(int n, int m){
        int lcm = 0;
        lcm = (n * m) / findGcd(n, m);
        System.out.print(lcm);
    }
    public static int findGcd(int n, int m){
        int tmp = 0;
        int num = 0;
        if(n > m){
            while(m != 0){
                tmp = n % m;
                num = m;
                n = m;
                m = tmp;
            }
            return num;
        }else{
            while(n != 0){
                tmp = m % n;
                num = n;
                m = n;
                n = tmp;
            }
            return num;
        }
    }
}