import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        Stack<Integer> s = new Stack<>();
        int N = sc.nextInt();
        for(int i = 0; i < N; i++){
            String str = sc.next();
            if(str.equals("push")){
                int a = sc.nextInt();
                s.push(a);
            }else if(str.equals("pop")){
                System.out.println(s.pop());
            }else if(str.equals("size")){
                System.out.println(s.size());
            }else if(str.equals("empty")){
                if(s.isEmpty()){
                    System.out.println(1);
                }else{
                    System.out.println(0);
                }
            }else{
                System.out.println(s.peek());
            }
        }
    }
}