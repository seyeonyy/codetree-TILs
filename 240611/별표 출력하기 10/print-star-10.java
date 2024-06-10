import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int cnt = n;

        for(int i = 0; i < 2 * n; i++){
            if(i % 2 == 0){
                count++;
                for(int j = 0; j < count; j++){
                    System.out.print("* ");
                }
            }else{
                cnt--;
                for(int j = 0; j < cnt + 1; j++){
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}