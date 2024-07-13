import java.util.Scanner;
public class Main {
    public static void swap(Number a, Number b){
        int temp = a.value;
        a.value = b.value;
        b.value = temp;
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Number a = new Number(n);
        Number b = new Number(m);
        swap(a,b);
        System.out.println(a.value + " " + b.value);
    }
}
class Number{
    int value;
    public Number(int value){
        this.value = value;
    }
}