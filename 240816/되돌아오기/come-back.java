import java.util.Scanner;
public class Main {
    public static int OFFSET = 1000;
    public static int[][] arr = new int[OFFSET*2+1][OFFSET*2+1];
    public static int[] dx = {0, 1, 0, -1};
    public static int[] dy = {1, 0, -1, 0};
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = 0;
        int time = 0;
        int x = OFFSET;
        int y = OFFSET;
        for(int i = 0; i < n; i++){
            char c = sc.next().charAt(0);
            int d = sc.nextInt();
            int moveDir = getDir(c);
            for(int j = 0; j < d; j++){
                t++;
                x = x + dx[moveDir];
                y = y + dy[moveDir];
                if(x == OFFSET && y == OFFSET){
                    time = t;
                }
            }
        }
        if(time == 0){
            System.out.println(-1);
        }else{
            System.out.println(time);
        }
    }
    public static int getDir(char c){
        if(c == 'E'){
            return 0;
        }else if(c == 'S'){
            return 1;
        }else if(c == 'W'){
            return 2;
        }else{
            return 3;
        }
    }
}