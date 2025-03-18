import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] arr = new int[200][200];
        int x = 100;
        int y = 100;
        int time = 1;
        int[] dx = new int[]{0, 1, 0, -1};
        int[] dy = new int[]{1, 0, -1, 0};
        int dirNum = 0;
        int t = -1;
        for(int i = 0; i < N; i++){
            char c = sc.next().charAt(0);
            if(c == 'N'){
                int n = sc.nextInt();
                dirNum = 1;
                for(int j = 0; j < n; j++){
                    x += dx[dirNum];
                    y += dy[dirNum];
                    arr[x][y] = time;
                    if(x == 100 && y == 100){
                        t = time;
                        System.out.println(t);
                    }
                    time++;
                }
            }
            if(c == 'E'){
                int n = sc.nextInt();
                dirNum = 0;
                for(int j = 0; j < n; j++){
                    x += dx[dirNum];
                    y += dy[dirNum];
                    arr[x][y] = time;
                    if(x == 100 && y == 100){
                        t = time;
                        System.out.println(t);
                    }
                    time++;
                }
            }
            if(c == 'S'){
                int n = sc.nextInt();
                dirNum = 3;
                for(int j = 0; j < n; j++){
                    x += dx[dirNum];
                    y += dy[dirNum];
                    arr[x][y] = time;
                    if(x == 100 && y == 100){
                        t = time;
                        System.out.println(t);
                    }
                    time++;
                }
            }
            if(c == 'W'){
                int n = sc.nextInt();
                dirNum = 2;
                for(int j = 0; j < n; j++){
                    x += dx[dirNum];
                    y += dy[dirNum];
                    arr[x][y] = time;
                    if(x == 100 && y == 100){
                        t = time;
                        System.out.println(t);
                    }
                    time++;
                }
            }
        }
        if(t == -1){
            System.out.println(-1);
        }
    }
}