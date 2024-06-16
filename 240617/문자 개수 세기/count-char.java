import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char c = sc.next().charAt(0);
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == c){
                count++;
            }
        }
        System.out.println(count);
    }
}