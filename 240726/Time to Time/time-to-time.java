import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int elapsedTime = 0;
        while(true){
            if(a == c && b == d){
                break;
            }
            elapsedTime++;
            b++;
            if(b == 60){
                a++;
                b = 0;
            }
        }
        System.out.print(elapsedTime);
    }
}