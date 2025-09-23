import java.util.Scanner;
import java.util.HashMap;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap <String, Integer> m = new HashMap<>();
        int n = sc.nextInt();
        String[] arr = new String[n];
        int cnt = 1;
        int max = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
            if(m.containsKey(arr[i])){
                int count = m.get(arr[i]);
                count++;
                m.put(arr[i], count);
            }else{
                m.put(arr[i], cnt);
            }
            if(m.get(arr[i]) > max){
                max = m.get(arr[i]);
            }
        }
        System.out.println(max);
    }
}