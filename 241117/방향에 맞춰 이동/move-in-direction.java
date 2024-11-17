import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] dx = new int[]{-1, 0, 0, 1 };
        int[] dy = new int[]{0, -1, 1, 0};
        int x = 0;
        int y = 0;
        for(int i = 0; i < N; i++){
            char d = sc.next().charAt(0);
            int s = sc.nextInt();
            for(int j = 0; j < s; j++){
                if(d == 'W'){
                    x += dx[0];
                    y += dy[0];
                }else if(d == 'S'){
                    x += dx[1];
                    y += dy[1];
                }else if(d == 'N'){
                    x += dx[2];
                    y += dy[2];
                }else{
                    x += dx[3];
                    y += dy[3];
                }
            }
        }
        System.out.println(x + " " + y);
    }
}