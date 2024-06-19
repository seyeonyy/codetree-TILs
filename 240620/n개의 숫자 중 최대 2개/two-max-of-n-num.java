import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for(int i = 0; i < N; i++){
            int n = sc.nextInt();
            if(n > max1){
                max1 = n; 
            }else{
                if(n >= max2){
                    max2 = n;
                }
            }
        }
        System.out.print(max1 + " " + max2);
    }
}