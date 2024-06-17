import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] arr = str.toCharArray();
        char c2 = arr[1];
        char c1 = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == c2){
                arr[i] = c1;
            }
        }
        str = String.valueOf(arr);
        System.out.print(str);
    }
}