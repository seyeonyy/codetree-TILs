import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char o = sc.next().charAt(0);
        int c = sc.nextInt();
        if(o == '+'){
            System.out.println(a + " + " + c + " = " + plus(a,c));
        }else if(o == '-'){
            System.out.println(a + " - " + c + " = " + minus(a,c));
        }else if(o == '/'){
            System.out.println(a + " / " + c + " = " + divide(a,c));
        }else if(o == '*'){
            System.out.println(a + " * " + c + " = " + multiply(a,c));
        }else{
            System.out.println("False");
        }
    }
    public static int plus(int a, int c){
        return a+c;
    }
    public static int minus(int a, int c){
        return a-c;
    }
    public static int divide(int a, int c){
        return a/c;
    }
    public static int multiply(int a, int c){
        return a*c;
    }
}