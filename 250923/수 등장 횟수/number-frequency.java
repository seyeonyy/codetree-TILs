import java.util.Scanner;
import java.util.HashMap;
public class Main {
    public static final int MAX_N = 100000;
    public static final int MAX_M = 100000;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[MAX_N];
        HashMap<Integer, Integer> numToIndex = new HashMap<>();
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            numToIndex.put(i, arr[i]);
        }
        for(int i = 0; i < m; i++){
            int num = sc.nextInt();
            int cnt = 0;
            for(int j = 0; j < n; j++){
                if(numToIndex.get(j) == num){
                    cnt++;
                }else{
                    break;
                }
            }
            System.out.print(cnt + " ");
        }
    }
}