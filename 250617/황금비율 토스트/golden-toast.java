import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        LinkedList<Character> l = new LinkedList<>();
        int n = sc.nextInt();
        int m = sc.nextInt();
        String bread = sc.next();
        for(int i = 0; i < n; i++){
            l.add(bread.charAt(i));
        }
        ListIterator<Character> it = l.listIterator(l.size());
        for(int i = 0; i < m; i++){
            char c = sc.next().charAt(0);
            if(c == 'L'){
                if(it.hasPrevious()){
                    it.previous();
                }
            }else if(c == 'R'){
                if(it.hasNext()){
                    it.next();
                }
            }else if(c == 'D'){
                if(it.hasPrevious()){
                    it.previous();
                }
                it.remove();
            }else{
                char d = sc.next().charAt(0);
                it.add(d);
                it.next();
            }
        }
        it = l.listIterator();
        while(it.hasNext()){
            System.out.print(it.next());
        }
    }
}