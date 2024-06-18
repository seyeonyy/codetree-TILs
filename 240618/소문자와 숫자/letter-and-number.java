import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int len = str.length();
        for(int i = 0; i < len; i++){
            if('a' <= str.charAt(i) && str.charAt(i) <= 'z'){
                System.out.print(str.charAt(i));
            }else if('A' <= str.charAt(i) && str.charAt(i) <= 'Z'){
                int n = str.charAt(i) - 'A' + 'a';
                System.out.print((char)n);
            }else if(48 <= (int)str.charAt(i) && (int)str.charAt(i) <= 57){
                System.out.print(str.charAt(i));
            }
        }
    }
}