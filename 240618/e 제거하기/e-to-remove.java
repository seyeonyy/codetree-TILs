import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = 'e';
        int len = str.length();
        for(int i = 0; i < len; i++){
            if(str.charAt(i) == c){
                str = str.substring(0, i) + str.substring(i+1);
                break;
            }
        }
        System.out.print(str);
    }
}