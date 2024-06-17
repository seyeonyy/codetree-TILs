import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String a = "ee";
        String b = "ab";
        if(str.contains(a)){
            System.out.print("Yes ");
        }else{
            System.out.print("No ");
        }
        if(str.contains(b)){
            System.out.print("Yes ");
        }else{
            System.out.print("No ");
        }
    }
}