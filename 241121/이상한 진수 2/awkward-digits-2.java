import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int m = 0;
        for(int i = 0; i < a.length(); i++){
            if(a.charAt(i) == '1'){
                m += 1;
            }
            if(m == a.length()){
                a = a.substring(0, a.length()-1) + '0';
            }
        }
        if(m != a.length()){
            for(int i = 0; i < a.length(); i++){
                if(a.charAt(i) == '0'){
                    a = a.substring(0, i) + '1' + a.substring(i+1);
                    break;
                }
            }
        }
        int sum = 0;
        for(int i = 0; i < a.length(); i++){
            if(a.charAt(i) == '1'){
                sum += Math.pow(2, (a.length()-1-i));
            }
        }
        System.out.println(sum);
    }
}