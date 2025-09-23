import java.util.Scanner;
import java.util.HashSet;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet <Integer> s = new HashSet<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String command = sc.next();
            int x = sc.nextInt();
            if(command.equals("find")){
                if(s.contains(x)){
                    System.out.println("true");
                }else{
                    System.out.println("false");
                }
            }else if(command.equals("add")){
                s.add(x);
            }else{
                s.remove(x);
            }
        }
    }
}