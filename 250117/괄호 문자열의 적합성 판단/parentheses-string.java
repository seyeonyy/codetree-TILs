import java.util.Scanner;
import java.util.Stack;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        Stack<Character> s = new Stack<>();
        String input = sc.nextLine();

        for (char c : input.toCharArray()) { 
            if (c == '(') {
                s.push('(');
            } else if (c == ')') {
                if (s.empty()) {
                    System.out.println("No");
                    return;
                }
                s.pop();
            }
        }
         if (s.empty()) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}