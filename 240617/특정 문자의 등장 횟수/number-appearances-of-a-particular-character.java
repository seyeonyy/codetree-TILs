import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int num = 0;
        int num2 = 0;
        for(int i = 0; i < str.length()-1; i++){
            if(str.charAt(i) == 'e' && str.charAt(i+1) == 'e'){
                num++;
            }
            if(str.charAt(i) == 'e' && str.charAt(i+1) == 'b'){
                num2++;
            }
        }
        System.out.print(num + " " + num2);
    }
}