import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = "";
        for(int i = 0; i < n; i++){
            str += sc.next();
        }
        int count = 0;
        for(int i = 0; i < str.length(); i+=5){
            for(int j = i; j < i+5; j++){
                if(j < str.length()){
                    System.out.print(str.charAt(j));
                }
            }
            System.out.println();
        }
    }
}