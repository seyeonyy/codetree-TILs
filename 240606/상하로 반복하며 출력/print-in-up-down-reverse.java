import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(j % 2 == 0){
                    System.out.print(1+i);
                }
                else{
                    System.out.print(n-i);
                }
            }
            System.out.println();
        }
    }
}