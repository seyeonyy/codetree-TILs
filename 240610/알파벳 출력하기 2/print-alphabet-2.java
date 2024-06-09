import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        char cnt = 'A';

        for(int i = 0; i < N; i++){
            for(int j = 1; j <= N; j++){
                if(i >= j){
                    System.out.print("  ");
                }else{
                    System.out.print(cnt + " ");
                    cnt++;
                    if(cnt > 'Z'){
                        cnt = 'A';
                    }
                }
            }
            System.out.println();
        }
    }
}