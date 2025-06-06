import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> v = new ArrayList<>();
        int N = sc.nextInt();
        for(int i = 0; i < N; i++){
            String str = sc.next();
            if(str.equals("push_back")){
                int A = sc.nextInt();
                v.add(A);
            }else if(str.equals("pop_back")){
                v.remove(v.size()-1);
            }else if(str.equals("size")){
                System.out.println(v.size());
            }else{
                int k = sc.nextInt();
                System.out.println(v.get(k-1));
            }
        }
    }
}