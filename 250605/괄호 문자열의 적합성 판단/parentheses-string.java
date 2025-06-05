import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        Stack<Character> s = new Stack<>();
        String str = sc.next();
        //int cnt = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == ')'){
                if(s.isEmpty()){
                    continue;
                }
                s.pop();
            }else if(str.charAt(i) == '('){
                s.push(str.charAt(i));
            }
        }
        if(str.charAt(0) != ')' && s.isEmpty()){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }
}