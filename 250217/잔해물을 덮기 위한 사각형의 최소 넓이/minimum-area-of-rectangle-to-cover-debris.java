import java.util.Scanner;
public class Main {
    public static int x1;
    public static int y1;
    public static int x2;
    public static int y2;
    public static int OFFSET = 1000;
    public static int[][] square = new int[2001][2001];
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int area1 = 0;
        int area2 = 0;
        int area3 = 0;
        for(int i = 0; i < 2; i++){
            x1 = sc.nextInt();
            y1 = sc.nextInt();
            x2 = sc.nextInt();
            y2 = sc.nextInt();
            x1 += OFFSET;
            y1 += OFFSET;
            x2 += OFFSET;
            y2 += OFFSET;
            if(i == 0){
                for(int j = x1; j<= x2-1; j++){
                    for(int k = y1; k <= y2-1; k++){
                        square[j][k] = 1;
                        area1++;
                    }
                }
            }else{
                for(int j = x1; j<= x2-1; j++){
                    for(int k = y1; k <= y2-1; k++){
                        if(square[j][k] == 0){
                            square[j][k] = 2;
                            area2++;
                        }else{
                            square[j][k] = 3;
                            area3++;
                        }
                    }
                }
            }
        }
        if(area2 == area3){
            System.out.println(area1-area2);
        }
        else if(area1 > area3){
            if(area2 >= area1 *2){
                System.out.println(area1-area3);
            }else{
                System.out.println(area1);
            }
        }
        else{
            System.out.println(0);
        }
    }
}