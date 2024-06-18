import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        while(true){
            String s = sc.next();
            if(s.equals("END")){
                break;
            }
            for(int i = s.length()-1; i >= 0; i--){
                System.out.print(s.charAt(i));
            }
            System.out.println();
        }
    }
}