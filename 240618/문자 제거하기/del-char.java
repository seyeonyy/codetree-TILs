import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int len = str.length();
        for(int i = 0; i < len; i++){
            int n = sc.nextInt();
            if(str.length() <= n){
                str = str.substring(0, str.length()-1);
            }
            else{
                str = str.substring(0, n) + str.substring(n+1);
            }
            System.out.println(str);
            if(str.length() == 1){
                break;
            }
        }
    }
}