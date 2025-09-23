import java.util.Scanner;
import java.util.HashMap;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        HashMap<Integer, Integer> m = new HashMap<>();
        for(int i = 0; i < n; i++){
            String s = sc.next();
            if(s.equals("add")){
                int k = sc.nextInt();
                int v = sc.nextInt();
                m.put(k, v);
            }else if(s.equals("remove")){
                int k = sc.nextInt();
                m.remove(k);
            }else{
                int k = sc.nextInt();
                if(m.containsKey(k)){
                    System.out.println(m.get(k));
                }else{
                    System.out.println("None");
                }
            }
        }
    }
}