import java.util.Scanner;
import java.util.Deque;
import java.util.ArrayDeque;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        Deque<Integer> dq = new ArrayDeque<>();
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            dq.addFirst(i);
        }
        while(dq.size() != 1){
            dq.pollLast();
            dq.addFirst(dq.peekLast());
            dq.pollLast();
        }
        System.out.println(dq.peekFirst());
    }
}