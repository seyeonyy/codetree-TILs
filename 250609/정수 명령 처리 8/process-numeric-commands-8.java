import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> l = new LinkedList<>();
        int N = sc.nextInt();
        for(int i = 0; i < N; i++){
            String str = sc.next();
            if(str.equals("push_front")){
                int A = sc.nextInt();
                l.addFirst(A);
            }else if(str.equals("push_back")){
                int A = sc.nextInt();
                l.addLast(A);
            }else if(str.equals("pop_front")){
                System.out.println(l.pollFirst());
            }else if(str.equals("pop_back")){
                System.out.println(l.pollLast());
            }else if(str.equals("size")){
                System.out.println(l.size());
            }else if(str.equals("empty")){
                if(l.isEmpty()){
                    System.out.println(1);
                }else{
                    System.out.println(0);
                }
            }else if(str.equals("front")){
                System.out.println(l.peekFirst());
            }else{
                System.out.println(l.peekLast());
            }
        }
    }
}