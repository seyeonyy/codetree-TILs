import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int min = Integer.MAX_VALUE;
        // Please write your code here.
        min = Math.min(min, Math.abs(A-B));
        min = Math.min(min, Math.abs(A-y)+Math.abs(B-x));
        min = Math.min(min, Math.abs(A-x)+Math.abs(y-B));
        System.out.println(min);
    }
}