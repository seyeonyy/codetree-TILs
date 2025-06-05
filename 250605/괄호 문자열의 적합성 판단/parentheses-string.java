import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        Stack<Character> s = new Stack<>();
        String str = sc.next();
        //int cnt = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '('){
                s.push(str.charAt(i));
            }else if(str.charAt(i) == ')'){
                if(s.isEmpty()){
                    continue;
                }s.pop();
            }
            
            // s.push(str.charAt(i));
            // if(s.peek() == '('){
            //     cnt++;
            //     System.out.println(cnt);
            // }else{
            //     cnt--;
            //     System.out.println(cnt);
            // }
        }
        // int cnt = 0;
        // for(int i = 0; i < str.length(); i++){
        //     if(s.peek() == '('){
        //         cnt++;
        //         System.out.println(cnt);
        //     }else{
        //         cnt--;
        //         System.out.println(cnt);
        //     }
        //     s.pop();
        // }
        if(s.isEmpty()){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}