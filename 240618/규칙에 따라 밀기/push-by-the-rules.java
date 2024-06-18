import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        int lenA = A.length();
        int lenB = B.length();
        for(int i = 0; i < lenB; i++){
            if(B.charAt(i) == 'L'){
                A = A.substring(1) + A.substring(0, 1);
            }else if(B.charAt(i) == 'R'){
                A = A.substring(lenA-1) + A.substring(0, lenA-1);
            }
        }
        System.out.print(A);
    }
}