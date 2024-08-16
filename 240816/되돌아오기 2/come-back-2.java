import java.util.Scanner;
public class Main {
    public static int[] dx = {0, 1, 0, -1};
    public static int[] dy = {1, 0, -1, 0};
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int x = 0;
        int y = 0;
        int dir = 0;
        int t = 0;
        int time = -1;
        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if(c == 'R'){
                dir = (dir+1) % 4; 
            }else if(c == 'L'){
                dir = (dir-1+4) % 4;
            }else{
                x = x + dx[dir];
                y = y + dy[dir];
            }
            t++;
            if(x == 0 && y == 0){
                if(time != -1){
                    break;
                }
                time = t;
            }
        }
        System.out.println(time);
    }
}