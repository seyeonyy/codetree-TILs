import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] arr2 = new int[10];

        for(int i = 0; i < 99; i++){
            int n = sc.nextInt();
            if(n == 0){
                break;
            }
            if(n >= 10){
                arr2[n / 10]++;
            }
        }
        for(int i = 1; i <= 9; i++){
            System.out.println(i + " - " + arr2[i]);
        }
    }
}