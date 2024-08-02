import java.util.Scanner;
public class Main {
    public static int n;
    public static int[] line = new int[201];
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int cnt = 1;
        int count = 0;
        for(int i = 0; i < n; i++){
            int x1 = sc.nextInt();
            int x2 = sc.nextInt();
            x1 += 100;
            x2 += 100;
            for(int j = x1; j <= x2-1; j++){
                line[j] += cnt;
            }
        }
        int max = 0;
        for(int i = 0; i < 201; i++){
            if(line[i] > max){
                max = line[i];
            }
        }
        System.out.print(max);
    }
}