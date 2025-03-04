import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int T = sc.nextInt();
        int R = sc.nextInt();
        int C = sc.nextInt();
        char D = sc.next().charAt(0);
        int[] dx = new int[]{0, 1, 0, -1};
        int[] dy = new int[]{1, 0, -1, 0};
        int dirNum = 0;
        if(D == 'U'){
            dirNum = 3;
            for(int i = 0; i < T; i++){
                R += dx[dirNum];
                C += dy[dirNum];
                if(!inRange(R, C, N)){
                    dirNum = 1;
                    R += dx[dirNum];
                    C += dy[dirNum];
                }
            }
        }
        if(D == 'D'){
            dirNum = 1;
            for(int i = 0; i < T; i++){
                R += dx[dirNum];
                C += dy[dirNum];
                if(!inRange(R, C, N)){
                    dirNum = 3;
                    R += dx[dirNum];
                    C += dy[dirNum];
                }
            }
        }
        if(D == 'R'){
            dirNum = 0;
            for(int i = 0; i < T; i++){
                R += dx[dirNum];
                C += dy[dirNum];
                if(!inRange(R, C, N)){
                    dirNum = 2;
                    R += dx[dirNum];
                    C += dy[dirNum];;
                }
            }
        }
        if(D == 'L'){
            dirNum = 2;
            for(int i = 0; i < T; i++){
                R += dx[dirNum];
                C += dy[dirNum];
                if(!inRange(R, C, N)){
                    dirNum = 0;
                    R += dx[dirNum];
                    C += dy[dirNum];
                }
            }
        }
        System.out.println(R + " " + C);
    }
    public static boolean inRange(int x, int y, int N){
        return(0 < x && x <= N && 0 < y && y <= N);
    }
}