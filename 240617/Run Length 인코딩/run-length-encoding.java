import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = "";
        int count = 1;
        for(int i = 0; i < A.length(); i++){
            if(i < A.length()-1 && A.charAt(i) == A.charAt(i+1)){
                count++;
                continue;
            }else{
                B += A.charAt(i);
                B += count;
                count = 1;
            }
        }
        System.out.println(B.length());
        for(int i = 0; i < B.length(); i++){
            System.out.print(B.charAt(i));
        }
    }
}