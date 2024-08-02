import java.util.Scanner;
public class Main {
    public static int[] lines = new int[201];
    public static int line = 0;
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            int x = sc.nextInt();
            char c = sc.next().charAt(0);
            if(c == 'R'){
                if(line >= 100){
                    for(int j = line; j >= line-x+1; j--){
                        lines[j] += 1;
                    }
                    line = line-x;

                }
                else{
                    for(int j = line; j <= x-1; j++){
                        lines[j] += 1;
                    }
                    line = x;
                }
            }else{
                if(line >= 100){
                    for(int j = line; j <= line+x-1; j++){
                        lines[j] += 1;
                    }
                    line = line+x;
                }
                else{
                    x = 100+(6- line);
                    for(int j = line; j >= 0; j--){
                        lines[j] += 1;
                    }
                    for(int j = 101; j <= x-1; j++){
                        lines[j] += 1;
                    }
                    line = x;
                }
            }
        }
        int cnt = 0;
        for(int i = 0; i < 201; i++){
            if(lines[i] >= 2){
                cnt++;
            }
        }
        System.out.print(cnt);
    }
}