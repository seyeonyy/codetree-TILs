import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String T = sc.next();
        String[] str = new String[n];
        for(int i = 0; i < n; i++){
            str[i] = sc.next();
        }
        Arrays.sort(str);
        String[] str2 = new String[n];
        int idx = 0;
        for(int i = 0; i < n; i++){
            if(str[i].length() >= T.length()){
                if(str[i].substring(0,T.length()).equals(T)){
                    str2[idx++] = str[i];
                }
            }
        }
        System.out.println(str2[k-1]);
    }
}