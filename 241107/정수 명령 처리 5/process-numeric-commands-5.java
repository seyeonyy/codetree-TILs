import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i = 0; i < N; i++){
            String s = sc.next();
            if(s.equals("push_back")){
                int a = sc.nextInt();
                arr.add(a);
            }else if(s.equals("pop_back")){
                arr.remove(arr.size()-1);
            }else if(s.equals("size")){
                System.out.println(arr.size());
            }else{
                int a = sc.nextInt();
                System.out.println(arr.get(a-1));
            }
        }
    }
}