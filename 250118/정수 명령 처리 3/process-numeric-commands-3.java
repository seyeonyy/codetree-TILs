import java.util.Scanner;
import java.util.Deque;
import java.util.ArrayDeque;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        Deque<Integer> dq = new ArrayDeque<>();
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            String s = sc.next();
            if(s.equals("push_front")){
                int a = sc.nextInt();
                dq.addFirst(a);
            }else if(s.equals("push_back")){
                int a = sc.nextInt();
                dq.addLast(a);
            }else if(s.equals("pop_front")){
                System.out.println(dq.pollFirst());
            }else if(s.equals("pop_back")){
                System.out.println(dq.pollLast());
            }else if(s.equals("size")){
                System.out.println(dq.size());
            }else if(s.equals("empty")){
                if(dq.isEmpty()){
                    System.out.println(1);
                }else{
                    System.out.println(0);
                }
            }else if(s.equals("front")){
                System.out.println(dq.peekFirst());
            }else{
                System.out.println(dq.peekLast());
            }
        }
    }
}