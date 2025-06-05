import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        Deque<Integer> dq = new ArrayDeque<>();
        int N = sc.nextInt();
        for(int i = 0; i < N; i++){
            String str = sc.next();
            if(str.equals("push_front")){
                int A = sc.nextInt();
                dq.addFirst(A);
            }else if(str.equals("push_back")){
                int A = sc.nextInt();
                dq.addLast(A);
            }else if(str.equals("pop_front")){
                System.out.println(dq.pollFirst());
            }else if(str.equals("pop_back")){
                System.out.println(dq.pollLast());
            }else if(str.equals("size")){
                System.out.println(dq.size());
            }else if(str.equals("empty")){
                if(dq.isEmpty()){
                    System.out.println(1);
                }else{
                    System.out.println(0);
                }
            }else if(str.equals("front")){
                System.out.println(dq.peekFirst());
            }else{
                System.out.println(dq.peekLast());
            }
        }
    }
}