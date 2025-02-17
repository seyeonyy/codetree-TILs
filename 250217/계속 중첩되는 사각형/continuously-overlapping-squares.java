import java.util.Scanner;
public class Main {
    public static int x1;
    public static int y1;
    public static int x2;
    public static int y2;
    public static int[][] square = new int[200][200];
    public static int OFFSET = 100;
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i = 1; i <= N; i++){
            x1 = sc.nextInt();
            y1 = sc.nextInt();
            x2 = sc.nextInt();
            y2 = sc.nextInt();
            x1 += OFFSET;
            y1 += OFFSET;
            x2 += OFFSET;
            y2 += OFFSET;
            if(i % 2 == 1){
                for(int j = x1; j <= x2-1; j++){
                    for(int k = y1; k <= y2-1; k++){
                        square[j][k] = 1;
                    }
                }
            }else{
                for(int j = x1; j <= x2-1; j++){
                    for(int k = y1; k <= y2-1; k++){
                        square[j][k] = 2;
                    }
                }
            }
        }
        int count = 0;
        for(int i = 0; i < 200; i++){
            for(int j = 0; j < 200; j++){
                if(square[i][j] == 2){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}