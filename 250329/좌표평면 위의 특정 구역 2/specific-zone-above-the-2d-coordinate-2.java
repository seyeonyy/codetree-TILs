import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arrX = new int[N];
        int[] arrY = new int[N];
        for(int i = 0; i < N; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            arrX[i] = x;
            arrY[i] = y;
        }
        int ans = Integer.MAX_VALUE;
        for(int i = 0; i < N; i++){
            int maxX = Integer.MIN_VALUE;
            int maxY = Integer.MIN_VALUE;
            int minX = Integer.MAX_VALUE;
            int minY = Integer.MAX_VALUE;
            for(int j = 0; j < N; j++){
                if(i == j){
                    continue;
                }
                minX = Math.min(minX, arrX[j]);
                minY = Math.min(minY, arrY[j]);
                maxX = Math.max(maxX, arrX[j]);
                maxY = Math.max(maxY, arrY[j]);
            }
            int area = (maxX-minX) * (maxY-minY);
            ans = Math.min(ans, area);
        }
        System.out.println(ans);
    }
}