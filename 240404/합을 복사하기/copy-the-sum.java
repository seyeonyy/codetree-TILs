public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        int a = 1;
        int b = 2;
        int c = 3;

        int d = a + b + c;
        a = b = c = d;

        System.out.println(a + " " + b + " " + c);
    }
}