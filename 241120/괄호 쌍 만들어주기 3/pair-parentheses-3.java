import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int cnt = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                for(int j = i+1; j < s.length(); j++){
                    if(s.charAt(j) == ')'){
                        cnt++;
                    }
                }
            }
        }
        System.out.println(cnt);
    }
}