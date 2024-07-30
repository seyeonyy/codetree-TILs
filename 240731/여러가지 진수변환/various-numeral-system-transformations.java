import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int B = sc.nextInt();
        int cnt = 0;
        int[] num = new int[1000];
        if(B == 4){
            while(true){
                if(N < 1){
                    break;
                }
                num[cnt++] = N % 4;
                N /= 4;
            }
        }else{
            while(true){
                if(N < 1){
                    break;
                }
                num[cnt++] = N % 8;
                N /= 8;
            }
        }
        for(int i = cnt-1; i >= 0; i--){
            System.out.print(num[i]);
        }
    }
}