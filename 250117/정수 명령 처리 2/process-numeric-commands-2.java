import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        Queue<Integer> q = new LinkedList<>();
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            String s = sc.next();
            if(s.equals("push")){
                int a = sc.nextInt();
                q.add(a);
            }else if(s.equals("pop")){
                System.out.println(q.poll());
            }else if(s.equals("size")){
                System.out.println(q.size());
            }else if(s.equals("empty")){
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