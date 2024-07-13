import java.util.Scanner;
class IntWrapper{
    int value;
    public IntWrapper(int value){
        this.value = value;
    }
}
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        IntWrapper n = new IntWrapper(a);
        IntWrapper m = new IntWrapper(b);
        modify(n, m);
        a = n.value;
        b = m.value;
        System.out.print(a + " " + b);
    }
    public static void modify(IntWrapper n, IntWrapper m){
        if(n.value > m.value){
            n.value *= 2;
            m.value += 10;
        }else{
            n.value += 10;
            m.value *= 2;
        }
    }
}