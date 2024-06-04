import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            for(int j = 0; j < (n-i) * (n-i); j++){
                if(j != 0){
                    if(j % (n-i) == 0){
                    System.out.print(" ");
                    }
                }
                System.out.print("*");   
            }
            System.out.println();
        }
    }
}