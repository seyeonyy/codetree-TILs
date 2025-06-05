import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        Stack<Character> s = new Stack<>();
        String str = sc.next();
        for(int i = 0; i < str.length(); i++){
            s.push(str.charAt(i));
        }
        int cnt = 0;
        for(int i = 0; i < str.length(); i++){
            if(s.peek() == '('){
                cnt++;
            }else{
                cnt--;
            }
            s.pop();
        }
        if(cnt == 0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}