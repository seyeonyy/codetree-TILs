import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        Queue<Integer> q = new LinkedList<>();
        int n = sc.nextInt();
        int k = sc.nextInt();
        for(int i = 1; i <= n; i++){
            q.add(i);
        }
        while(q.size() != 0){
            for(int i = 1; i < k; i++){
                q.add(q.peek());
                q.poll();
            }
            System.out.print(q.poll() + " ");
        }
    }
}