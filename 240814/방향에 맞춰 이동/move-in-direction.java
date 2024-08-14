import java.util.Scanner;
public class Main {
    public static int[] dx = new int[]{-1, 0 , 1, 0};
    public static int[] dy = new int[]{0, -1, 0, 1};
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nx = 0;
        int ny = 0;
        for(int i = 0; i < n; i++){
            char c = sc.next().charAt(0);
            int d = sc.nextInt();
            if(c == 'W'){
                for(int j = 0; j < d; j++){
                    nx += dx[0];
                }
            }
            if(c == 'S'){
                for(int j = 0; j < d; j++){
                    ny += dy[1];
                }
            }
            if(c == 'N'){
                for(int j = 0; j < d; j++){
                    ny += dy[3];
                }
            }
            if(c == 'E'){
                for(int j = 0; j < d; j++){
                    nx += dx[2];
                }
            }
        }
        System.out.println(nx + " " + ny);
    }
}