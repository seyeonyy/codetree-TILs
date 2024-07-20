import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static char[] ch1;
    public static char[] ch2;
    public static int N;
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        ch1 = str1.toCharArray();
        ch2 = str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        N = ch1.length;
        if(equal()){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
    }
    public static boolean equal(){
        if(ch1.length != ch2.length){
            return false;
        }else{
            for(int i = 0; i < N; i++){
                if(ch1[i] != ch2[i]){
                    return false;
                }
            }
        }
        return true;
    }
}