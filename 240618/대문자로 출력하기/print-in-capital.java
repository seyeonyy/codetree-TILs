import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] arr = new char[str.length()];
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            if('a' <= str.charAt(i) && str.charAt(i) <= 'z' || 'A' <= str.charAt(i) && str.charAt(i) <= 'Z'){
                if('A' <= str.charAt(i) && str.charAt(i) <= 'Z'){
                    arr[count] = str.charAt(i);
                }
                else{
                    int x = str.charAt(i) -'a' + 'A';
                    arr[count] = (char)x;
                }
                count++;
            }
        }
        char[] arr2 = new char[count];
        str = String.valueOf(arr);
        for(int i = 0; i < arr2.length; i++){
            arr2[i] = str.charAt(i);
        }
        str = String.valueOf(arr2);
        System.out.print(str);
    }
}