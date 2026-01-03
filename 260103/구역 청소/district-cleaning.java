import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        // Please write your code here.
        int min = 100;
        int max = 0;

        if((b < c) || (d < a)){
            System.out.println((b-a)+(d-c));
        }else{
            if(a <= c){
                min = a;
            }else if(c <= a){
                min = c;
            }
            if(b <= d){
                max = d; 
            }else if(d <= b){
                max = b;
            }
            System.out.println(max-min);
        }
    }
}