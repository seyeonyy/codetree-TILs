import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int dirNum = 0;
        int[] dx = new int[]{1, 0, -1, 0};
        int[] dy = new int[]{0, -1, 0, 1};
        int x = 0;
        int y = 0;
        for(int i = 0; i < N; i++){
            char c = sc.next().charAt(0);
            int d = sc.nextInt();
            if(c == 'E'){
                dirNum = 0;
            }else if(c == 'S'){
                dirNum = 1;
            }else if(c == 'W'){
                dirNum = 2;
            }else{
                dirNum = 3;
            }
            for(int j = 0; j < d; j++){
                x += dx[dirNum];
                y += dy[dirNum];
            }
        }
        System.out.println(x + " " + y);
    }
}