import java.util.Scanner;
public class Main {
    public static int[] line = new int[101];
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            int x1 = sc.nextInt();
            int x2 = sc.nextInt();
            for(int j = x1; j <= x2; j++){
                line[j] += 1;
            }
        }
        int max = 0;
        for(int i = 0; i < 101; i++){
            if(line[i] > max){
                max = line[i];
            }
        }
        System.out.print(max);
    }
}