import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int prod = a;
        
        if(b == 0){
            a = 1;
        }
        else{
            for(int i = 1; i< b; i++){
            a *= prod;
            }
        }
        System.out.println(a);
    }
}