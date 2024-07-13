import java.util.Scanner;
public class Main {
    public static int sum = 0;
    public static int[] A = new int[100];
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for(int i = 0; i < n; i++){
            A[i] = sc.nextInt();
        }
        System.out.println(modify(A, m));
    }
    public static int modify(int[] A, int m){
        sum += A[m-1];
        while(m != 1){
            if(m % 2 == 1){
                m -= 1;
            }else{
                m /= 2;
            }
            sum += A[m-1];
        }
        return sum;
    }
}