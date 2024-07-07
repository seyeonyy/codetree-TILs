import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.print(findMin(a,b,c));
    }
    public static int findMin(int a, int b, int c){
        int min = 0;
        if(a <= b && b <= c || a <= c && c <= b){
            min = a;
        }else if(b <= a && a <= c || b <= c && c <= a){
            min = b;
        }else if(c <= a && a <= b || c <= b && b <= c){
            min = c;
        }
        return min;
    }
}