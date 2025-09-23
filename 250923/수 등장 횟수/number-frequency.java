import java.util.Scanner;
import java.util.HashMap;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
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
                }
            }
            System.out.print(cnt + " ");
        }
    }
}