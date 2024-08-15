import java.util.Scanner;
public class Main {
    public static int n;
    public static int[][] arr = new int[51][51]; 
    public static int[] dx = new int[]{0, 1, -1, 0};
    public static int[] dy = new int[]{1, 0, 0, -1};
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int t = sc.nextInt();
        int r = sc.nextInt();
        int c = sc.nextInt();
        char d = sc.next().charAt(0);
        int moveDir = getDir(d);
        int nx = 0;
        int ny = 0;
        int x = 0;
        int y = 0;
        r -= 1;
        c -= 1;
        while(t-- > 0){
            r += dx[moveDir];
            c += dy[moveDir];
            if(!inRange(r, c)){
                moveDir = 3 - moveDir;
                if(r < 0){
                    r = 0;
                }
                if(c < 0){
                    c = 0;
                }
                if (r >= n){
                    r = n-1;
                }
                if(c >= n){
                    c = n-1;
                }
            }
        }
        r += 1;
        c += 1;
        System.out.println(r + " " + c);
    }
    public static int getDir(char d){
        if(d == 'U'){
            return 2;
        }else if(d == 'D'){
            return 1;
        }else if(d == 'R'){
            return 0;
        }else{
            return 3;
        }
    }
    public static boolean inRange(int x, int y){
        return (0 <= x && x < n && 0 <= y && y < n);
    }
}