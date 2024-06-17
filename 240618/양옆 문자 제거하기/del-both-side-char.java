import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        str = str.substring(0,1) + str.substring(2, str.length()-2) + str.substring(str.length()-1);
        System.out.print(str);
    }
}