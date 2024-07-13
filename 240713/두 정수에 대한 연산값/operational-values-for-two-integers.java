import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[2];
        int a = sc.nextInt();
        int b = sc.nextInt();
        modify(arr,a,b);
        System.out.print(arr[0] + " " + arr[1]);
    }
    public static void modify(int[] arr, int a, int b){
        if(a > b){
            a += 25;
            b *= 2;
        }else{
            a *= 2;
            b += 25;
        }
        arr[0] = a;
        arr[1] = b;
    }    
}