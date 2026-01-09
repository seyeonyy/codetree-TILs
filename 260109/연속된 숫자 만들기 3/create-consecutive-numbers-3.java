import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        // Please write your code here.
        int result = 0;
        if(b - a == 1 && c - b == 1){
            result = 0;
        }else if(b - a > c - b){
            int tmp = 0;
            while(!(b - a == 1 && c - b == 1)){
                c = b-1;
                tmp = c;
                c = b;
                b = tmp;
                result++;
            }
        }else{
            int tmp = 0;
            while(!(b - a == 1 && c - b == 1)){
                a = b+1;
                tmp = a;
                a = b;
                b = tmp;
                result++;
            }
        }
        // }else if(b - a == 1){
        //     int tmp = 0;
        //     while(!(b - a == 1 && c - b == 1)){
        //         a = b+1;
        //         tmp = a;
        //         a = b;
        //         b = tmp;
        //         result++;
        //     }
        // }else if(b )
        // }else{
        //     int tmp = 0;
        //     while(!(b - a == 1 && c - b == 1)){
        //         c = b-1;
        //         tmp = c;
        //         c = b;
        //         b = tmp;
        //         result++;
        //     }
        // }
        System.out.println(result);
    }
}