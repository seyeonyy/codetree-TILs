import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            if(i > 0 && i < n){
                for(int k = 0; k < n; k++){
                    if(k < i || k == n-1){
                        System.out.print("* ");
                    }else{
                        System.out.print("  ");
                    }
                }
            }else{
                for(int j = 0; j < n; j++){
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}