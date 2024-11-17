import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int dirNum = 0;
        int[] dy = new int[]{1, 0, -1, 0};
        int[] dx = new int[]{0, 1, 0, -1};
        int x = 0;
        int y = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'L'){
                dirNum = (dirNum-1+4) % 4;
            }else if(s.charAt(i) == 'R'){
                dirNum = (dirNum +1 ) % 4;
            }else{
                x += dx[dirNum];
                y += dy[dirNum];
            }
        }
        System.out.println(x + " " + y);
    }
}