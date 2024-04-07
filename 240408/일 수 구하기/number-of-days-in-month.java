import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n == 2){
            System.out.println(28);
        } else if(n == 1 || n == 3 || n == 5 || n == 7 || n == 8 || n ==10 || n == 12){
            System.out.println(31);
        } else{
            System.out.println(30);
        }
    }
}