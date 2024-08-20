import java.util.Scanner;
public class Main {
    public static int n;
    public static int[] dx1 = {0, 1, 0, -1};
    public static int[] dy1 = {1, 0, -1, 0};
    public static int[] dx2 = {0, -1, 0, 1};
    public static int[] dy2 = {1, 0, -1, 0};
    public static int[] dx3 = {0, 1, 0, -1};
    public static int[] dy3 = {-1, 0, 1, 0};
    public static int[][] arr1 = new int[1001][1001]; 
    public static char[][] arr2 = new char[1001][1001];
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i = 0; i < n; i++){
            String str = sc.next();
            for(int j = 0; j < n; j++){
                arr2[i][j] = str.charAt(j);
            }
        }
        int k = sc.nextInt();
        int x = 0;
        int y = 0;
        int cnt = 1;
        int idx = 0;
        int count = 0;
        while(cnt != 4*n+1){
            arr1[x][y] = cnt;
            if(cnt == k){
                int nx = x;
                int ny = y;
                for(int i = 0; i < n; i++){
                    for(int j = 0; j < n; j++){
                        if(k <= n){
                            if(arr2[nx][ny] == '\\'){
                                nx += dx2[0];
                                ny += dy2[0];
                                if(!inRange(nx, ny)){
                                    break;
                                }
                            }
                            else if(arr2[nx][ny] == '/'){
                                nx += dx3[0];
                                ny += dy3[0];
                                if(!inRange(nx, ny)){
                                    break;
                                }
                            }
                            count++;
                        }else if(k <= 2*n){
                            if(arr2[nx][ny] == '\\'){
                                nx += dx2[1];
                                ny += dy2[1];
                                if(!inRange(nx, ny)){
                                    break;
                                }
                            }
                            else if(arr2[nx][ny] == '/'){
                                nx += dx3[1];
                                ny += dy3[1];
                                if(!inRange(nx, ny)){
                                    break;
                                }
                            }
                            count++;
                        }else if(k <= 3*n){
                            if(arr2[nx][ny] == '\\'){
                                nx += dx2[2];
                                ny += dy2[2];
                                if(!inRange(nx, ny)){
                                    break;
                                }
                            }
                            else if(arr2[nx][ny] == '/'){
                                nx += dx3[2];
                                ny += dy3[2];
                                if(!inRange(nx, ny)){
                                    break;
                                }
                            }
                            count++;
                        }else{
                            if(arr2[nx][ny] == '\\'){
                                nx += dx2[3];
                                ny += dy2[3];
                                if(!inRange(nx, ny)){
                                    break;
                                }
                            }
                            else if(arr2[nx][ny] == '/'){
                                nx += dx3[3];
                                ny += dy3[3];
                                if(!inRange(nx, ny)){
                                    break;
                                }
                            }
                            count++;
                        }
                    }
                }
            }
            x += dx1[idx];
            y += dy1[idx];
            if(cnt % n == 0){
                idx++;
                if(x == n){
                    x-=1;
                }else if(y == n){
                    y-=1;
                }else if(x == n-1 && y < 0){
                    x = n-1;
                    y = 0;
                }
            }
            cnt++;
        }
        System.out.println(count);
    }
    public static boolean inRange(int x, int y){
        return x <= 0 && x < n && y <= 0 && y < n;
    }
}