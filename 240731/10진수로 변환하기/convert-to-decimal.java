import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] binary = new int[8];
        int count = 0;
        while(true){
            if(n < 1){
                break;
            }
            binary[count++] = n % 10;
            n/=10;
        }
        int num = 0;
        for(int i = 0; i < count; i++){
            num += (int)Math.pow(2, i) * binary[i];
        }
        System.out.print(num);
    }
}