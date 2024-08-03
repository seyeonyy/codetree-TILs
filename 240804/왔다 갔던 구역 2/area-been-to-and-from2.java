import java.util.Scanner;
public class Main {
    public static int[] lines = new int[2001];
    public static int line = 1000;
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            int x = sc.nextInt();
            char c = sc.next().charAt(0);
            if(c == 'R'){
                for(int j = line; j <= line+x-1; j++){
                    lines[j] += 1;
                }
                line = line+x;
            }else{
                for(int j = line-1; j >= line-x; j--){
                    lines[j] += 1;
                }
                line = line-x;
            }
        }
        int cnt = 0;
        for(int i = 0; i < 2001; i++){
            if(lines[i] >= 2){
                cnt++;
            }
        }
        System.out.print(cnt);
    }
}