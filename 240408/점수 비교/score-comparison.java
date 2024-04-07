import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int A_math = sc.nextInt();
        int A_english = sc.nextInt();

        int B_math = sc.nextInt();
        int B_english = sc.nextInt();

        if(A_math > B_math && A_english > B_english){
            System.out.println(1);
        } else{
            System.out.println(0);
        }
    }
}