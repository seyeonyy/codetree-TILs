import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        char alphabet = sc.next().charAt(0);

        if(alphabet == 'S'){
            System.out.println("Superior");
        } else if(alphabet == 'A'){
            System.out.println("Excellent");
        } else if(alphabet == 'B'){
            System.out.println("Good");
        } else if(alphabet == 'C'){
            System.out.println("Usually");
        } else if(alphabet == 'D'){
            System.out.println("Effort");
        } else{
            System.out.println("Failure");
        }
    }
}