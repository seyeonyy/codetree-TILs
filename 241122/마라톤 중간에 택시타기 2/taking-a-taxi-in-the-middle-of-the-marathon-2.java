import java.util.Scanner;
public class Main {
    public static final int INT_MAX = Integer.MAX_VALUE;
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arrX = new int[N];
        int[] arrY = new int[N];
        for(int i = 0; i < N; i++){
            arrX[i] = sc.nextInt();
            arrY[i] = sc.nextInt();
        }
        int ans = INT_MAX;
        int s = 1;
        int c = 0;
        for(int i = 1; i < N-1; i++){
            int minD = 0;
            for(int j = 0; j < N-1; j++){
                if(j != s){
                    if(j+1 == s){
                        c = j+2;
                    }else{
                        c = j+1;
                    }
                    minD += Math.abs(arrX[j] - arrX[c]) + Math.abs(arrY[j] - arrY[c]);
                }
            }
            s+=1;
            ans = Math.min(ans, minD);
            
        }
        System.out.println(ans);
    }
}