import java.util.Scanner;
public class Main {
    public static int[] W = new int[1000*100*2+1];
    public static int[] B = new int[1000*100*2+1];
    public static char[] tiles = new char[1000*100*2+1];
    public static int tile = 1000*100;
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cntB = 0;
        int cntW = 0;
        int cntG = 0;
        for(int i = 0; i < n; i++){
            int x = sc.nextInt();
            char c = sc.next().charAt(0);
            if(c == 'R'){
                for(int j = tile; j <= tile+x-1; j++){
                    if(tiles[j] == 'G'){
                        continue;
                    }else{
                        tiles[j] = 'B';
                        B[j]++;
                    }
                    if(B[j] >= 2 && W[j] >= 2){
                        B[j] = 0;
                        W[j] = 0;
                        tiles[j] = 'G';
                    }
                }
                tile = tile +x-1;
            }else{
                for(int j = tile; j >= tile-x+1; j--){
                    if(tiles[j] == 'G'){
                        continue;
                    }else{
                        tiles[j] = 'W';
                        W[j]++;
                    }
                    if(B[j] >= 2 && W[j] >= 2){
                        B[j] = 0;
                        W[j] = 0;
                        tiles[j] = 'G';
                    }
                }
                tile = tile-x+1;
            }
        }
        for(int i = 0; i < 200001; i++){
            if(tiles[i] == 'W'){
                cntW++;
            }
            if(tiles[i] == 'B'){
                cntB++;
            }
            if(tiles[i] == 'G'){
                cntG++;
            }
        }
        System.out.println(cntW+ " " + cntB+ " "+ cntG);
    }
}