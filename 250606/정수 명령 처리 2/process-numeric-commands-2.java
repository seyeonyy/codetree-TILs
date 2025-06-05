import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i < N; i++){
            String str = sc.next();
            if(str.equals("push")){
                int A = sc.nextInt();
                q.add(A);
            }else if(str.equals("pop")){
                System.out.println(q.poll());
            }else if(str.equals("size")){
                System.out.println(q.size());
            }else if(str.equals("empty")){
                if(q.isEmpty()){
                    System.out.println(1);
                }else{
                    System.out.println(0);
                }
            }else{
                System.out.println(q.peek());
            }
        }
    }
}