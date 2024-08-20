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
        int cx = 0;
        int cy = 0;
        int px = 0;
        int py = 0;
        while(cnt != 4*n+1){
            arr1[x][y] = cnt;
            if(cnt == k){
                cx = x;
                cy = y;
                if(k <= n){
                    px = -1;
                    py = y;
                }else if(k <= 2*n){
                    py = n;
                    px = x;
                }else if(k <= 3*n){
                    px = n;
                    py = y;
                }else if (k <= 4*n){
                    py = -1;
                    px = x;
                }
                for(int i = 0; i < n*n; i++){
                    if(px < cx){
                        if(arr2[cx][cy] == '\\'){
                            count++;
                            px = cx;
                            py = cy;
                            if(!inRange(cx,cy)){
                                break;
                            }
                            cx += dx2[0];
                            cy += dy2[0];
                        }else if(arr2[cx][cy] == '/'){
                            count++;
                            px = cx;
                            py = cy;
                            if(!inRange(cx,cy)){
                                break;
                            }
                            cx += dx3[0];
                            cy += dy3[0];
                        }
                    }else if(px > cx){
                        if(arr2[cx][cy] == '\\'){
                            count++;
                            px = cx;
                            py = cy;
                            if(!inRange(cx,cy)){
                                break;
                            }
                            cx += dx2[2];
                            cy += dy2[2];
                        }else if(arr2[cx][cy] == '/'){
                            count++;
                            px = cx;
                            py = cy;
                            if(!inRange(cx,cy)){
                                break;
                            }
                            cx += dx3[2];
                            cy += dy3[2];
                        }
                    }else if(py > cy){
                        if(arr2[cx][cy] == '\\'){
                            count++;
                            px = cx;
                            py = cy;
                            if(!inRange(cx,cy)){
                                break;
                            }
                            cx += dx2[1];
                            cy += dy2[1];
                        }else if(arr2[cx][cy] == '/'){
                            count++; 
                            px = cx;
                            py = cy;
                            if(!inRange(cx,cy)){
                                break;
                            }
                            cx += dx3[1];
                            cy += dy3[1];
                        }
                    }else if(py < cy){
                        if(arr2[cx][cy] == '\\'){
                            count++; 
                            px = cx;
                            py = cy;
                            if(!inRange(cx,cy)){
                                break;
                            }
                            cx += dx2[3];
                            cy += dy2[3];
                        }else if(arr2[cx][cy] == '/'){
                            count++; 
                            px = cx;
                            py = cy;
                            if(!inRange(cx,cy)){
                                break;
                            }
                            cx += dx3[3];
                            cy += dy3[3];
                        }
                    }
                }
            }
            x += dx1[idx];
            y += dy1[idx];
            if(cnt % n == 0){
                idx++;
                if(idx >= 4) {
                    idx = 0;
                }
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
        return 0 <= x && x < n && 0 <= y && y < n;
    }
}