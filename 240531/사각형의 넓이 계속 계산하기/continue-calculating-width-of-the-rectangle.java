import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        while(true){
            int width = sc.nextInt();
            int length = sc.nextInt();
            char character = sc.next().charAt(0);

            int area = width * length;
            System.out.println(area);
            if(character == 'C'){
                break;
            }
        }
    }
}