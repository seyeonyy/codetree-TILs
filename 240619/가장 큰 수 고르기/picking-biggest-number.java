import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int max = 1;
        
        for(int i = 0; i < 10; i++){
            int n = sc.nextInt();
            if(n > max){
                max = n;
            }
        }
        System.out.println(max);
    }
}