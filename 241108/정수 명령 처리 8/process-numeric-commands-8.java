import java.util.Scanner;
import java.util.LinkedList;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        LinkedList<Integer> arr = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i = 0; i < N; i++){
            String s = sc.next();
            if(s.equals("push_front")){
                int a = sc.nextInt();
                arr.addFirst(a);
            }else if(s.equals("push_back")){
                int a = sc.nextInt();
                arr.addLast(a);
            }else if(s.equals("pop_front")){
                System.out.println(arr.pollFirst());
            }else if(s.equals("pop_back")){
                System.out.println(arr.pollLast());
            }else if(s.equals("size")){
                System.out.println(arr.size());
            }else if(s.equals("empty")){
                if(arr.isEmpty()){
                    System.out.println(1);
                }else{
                    System.out.println(0);
                }
            }else if(s.equals("front")){
                System.out.println(arr.peekFirst());
            }else{
                System.out.println(arr.peekLast());
            }
        }
    }
}