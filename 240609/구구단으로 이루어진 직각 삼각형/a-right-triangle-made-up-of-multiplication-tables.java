import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n-i+1; j++){
                if(j < n-i+1){
                    System.out.print(i + " * " + j + " = " + (i * j) + " / ");
                }
                else{
                    System.out.println(i + " * " + j + " = " + (i * j));
                }
            }
        }
    }
}