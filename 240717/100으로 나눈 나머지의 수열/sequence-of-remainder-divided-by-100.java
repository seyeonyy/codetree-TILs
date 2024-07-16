import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(sequenceNum(N));
    }
    public static int sequenceNum(int n){
        if(n == 1){
            return 2;
        }else if(n == 2){
            return 4;
        }
        return (sequenceNum(n-2) * sequenceNum(n-1)) % 100;
    }

}