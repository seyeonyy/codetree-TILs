import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[] dx = new int[]{-1, 0, 1, 0};
        int[] dy = new int[]{0, 1, 0, -1};
        int x = 100000;
        int y = 100000;
        int dirNum = 0;
        int time = -1;
        for(int i = 1; i <= s.length(); i++){
            char c = s.charAt(i-1);
            if(c == 'F'){
                x += dx[dirNum];
                y += dy[dirNum]; 
                if(x == 100000 && y == 100000){
                    time = i;
                    System.out.println(time);
                    break;
                }
            }
            if(c == 'R'){
                dirNum = (dirNum+1)%4;
            }
            if(c == 'L'){
                dirNum = (dirNum+3)%4;
            }
        }
        if(time == -1){
            System.out.println(time);
        }
    }
}