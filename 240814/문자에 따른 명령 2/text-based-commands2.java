import java.util.Scanner;
public class Main {
    public static int[] dx = new int[]{0, 1, 0, -1};
    public static int[] dy = new int[]{1, 0, -1, 0};
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int x = 0;
        int y = 0;
        int dir = 0;
        String str = sc.next();
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == 'L'){
                dir = (dir-1+4) % 4;
            }else if(str.charAt(i) == 'R'){
                dir = (dir+1) % 4;
            }else{
                x += dx[dir];
                y += dy[dir];
            }
        }
        System.out.println(x + " " + y);
    }
}