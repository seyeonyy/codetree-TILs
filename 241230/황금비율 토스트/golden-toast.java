import java.util.Scanner;
import java.util.LinkedList;
import java.util.ListIterator;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String s = sc.next();
        LinkedList<Character> l = new LinkedList<>();
        for(int i = 0; i < n; i++){
            l.add(s.charAt(i));
        }
        ListIterator<Character> it = l.listIterator(l.size());
        for(int i = 0; i < m; i++){
            char c = sc.next().charAt(0);
            if(c == 'L'){
                it.previous();
            }else if(c == 'R'){
                it.next();
            }else if(c == 'D'){
                it.next();
                it.remove();
            }else if(c == 'P'){
                char c2 = sc.next().charAt(0);
                it.add(c2);
            }
        }
        it = l.listIterator();
        while(it.hasNext()){
            System.out.print(it.next());
        }
    }
}