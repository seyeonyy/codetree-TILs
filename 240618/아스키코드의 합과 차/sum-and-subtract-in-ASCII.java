import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        char b = sc.next().charAt(0);

        int sum = (int)a + (int)b;
        int diff = 0;
        if((int)a > (int)b){
            diff = (int)a - (int)b;
        }else{
            diff = (int)b - (int)a;
        }
        System.out.print(sum + " " + diff);
    }
}