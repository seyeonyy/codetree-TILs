import java.util.Scanner;
public class Main {
    public static final int OFFSET = 1000;
    public static int[][] square1 = new int[OFFSET*2+1][OFFSET*2+1];
    //public static int[][] square2 = new int[OFFSET*2+1][OFFSET*2+1];
    public static int x1;
    public static int y1;
    public static int x2;
    public static int y2;
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 2; i++){
            x1 = sc.nextInt();
            y1 = sc.nextInt();
            x2 = sc.nextInt();
            y2 = sc.nextInt();
            for(int j = OFFSET+x1; j < OFFSET+x2; j++){
                for(int k = OFFSET+y1; k < OFFSET+y2; k++){
                    square1[j][k] = i+1;
                }
            }
        }
        int minX = 0;
        int maxX = 0;
        int minY = 0;
        int maxY = 0;
        boolean first = true;
        for(int i = 0; i < OFFSET*2+1; i++){
            for(int j = 0; j < OFFSET*2+1; j++){
                if(square1[i][j] == 1 && first){
                    minX = i;
                    minY = j;
                    first = false;
                }else if(square1[i][j] == 1){
                    maxX = i;
                    maxY = j;
                }
            }
        }
        System.out.println((maxX-minX+1)*(maxY-minY+1));
    }
}