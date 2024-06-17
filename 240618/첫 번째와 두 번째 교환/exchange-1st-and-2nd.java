import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        char[] arr = str.toCharArray();
        char temp;
        temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
        char a = arr[0];
        char b = arr[1];   
        for(int i = 2; i < arr.length; i++){
            if(arr[i] == b){
                arr[i] = a;
            }else if(arr[i] == a){
                arr[i] = b;
            }
        }
        String s = String.valueOf(arr);
        System.out.print(s);
    }
}