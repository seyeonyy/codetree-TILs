import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String T = sc.next();
        // System.out.println(String.format("T: %s", T));
        String[] str = new String[n];
        for(int i = 0; i < n; i++){
            try {
                str[i] = sc.next();
            } catch (Exception ex) {
                System.out.println(String.format("Current i: %d, n: %d, k: %d, T: %s", i, n, k, T));
            }
            // System.out.println(String.format("str[%d]: %s", i, str[i]));
        }
        Arrays.sort(str);
        String[] str2 = new String[n];
        for(int i = 0; i < n; i++){
            if(str[i].substring(0,T.length()).equals(T)){
                str2[i] = str[i];
            }
        }
        int count = 0;
        for(int i = 0; i < n; i++){
            if(str2[i] != null){
                count++;
            }
        }
        int index = 0;
        String[] str3 = new String[count];
        for(int i = 0; i < n; i++){
            if(str2[i] != null){
                str3[index++] = str2[i];
            }
        }
        System.out.println(str3[k-1]);
    }
}