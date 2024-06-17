import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        if((A+B).equals(B+A)){
            System.out.print("true");
        }else{
            System.out.print("false");
        }
    }
}