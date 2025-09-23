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
        int cnt = 1;
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            if(numToIndex.containsKey(arr[i])){
                int count = numToIndex.get(arr[i]);
                count += 1;
                numToIndex.put(arr[i], count);
            }else{
                numToIndex.put(arr[i], cnt);
            }
        }
        for(int i = 0; i < m; i++){
            int num = sc.nextInt();
            if(numToIndex.containsKey(num)){
                System.out.print(numToIndex.get(num) + " ");
            }else{
                System.out.print(0 + " ");
            }
        }
    }
}