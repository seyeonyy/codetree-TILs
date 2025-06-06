import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Deque<Integer> dq = new ArrayDeque<>();
        for(int i = 0; i < N; i++){
            dq.addLast(i+1);
        }
        while(dq.size()!=1){
            dq.pollFirst();
            dq.addLast(dq.pollFirst());
        }
        System.out.println(dq.pollFirst());
    }
}