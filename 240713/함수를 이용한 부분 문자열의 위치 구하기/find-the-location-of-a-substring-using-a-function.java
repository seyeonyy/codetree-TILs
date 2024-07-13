import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        String M = sc.next();
        System.out.println(str(N,M));
    }
    public static int str(String N, String M){
        int cnt = 0;
        int count = 0;
        for(int i = 0; i <= N.length(); i++){
            if(N.charAt(i-count) == M.charAt(cnt)){
                cnt++;
            }else{
                count = 1;
                cnt = 0;
            }
            if(cnt == M.length()){
            return i-M.length();
            }
        }
        return -1;
    }
}