import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        if(A.equals(modify(A))){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
    public static String modify(String s){
        String s2 = "";
        for(int i = s.length()-1; i >= 0; i--){
            s2 += s.charAt(i);
        }
        return s2;
    }
}