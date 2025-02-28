import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int[] dx = new int[]{1, 0, -1, 0};
        int[] dy = new int[]{0, -1, 0, 1};
        int x = 0;
        int y = 0;
        int dirNum = 3;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == 'L'){
                dirNum = (dirNum+3)%4;
            }else if(str.charAt(i) == 'R'){
                dirNum = (dirNum+1)%4;
            }else{
                x += dx[dirNum];
                y += dy[dirNum];
            }
        }
        System.out.println(x + " " + y);
    }
}