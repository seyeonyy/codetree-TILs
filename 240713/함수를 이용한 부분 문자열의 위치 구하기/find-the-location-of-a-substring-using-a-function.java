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
        int count = 0;
        for(int i = 0; i < N.length(); i++){
            int cnt = 0;
            for(int j = 0; j < M.length(); j++){
                if(i+cnt >= N.length()){
                    return -1;
                }
                if(N.charAt(i+cnt) != M.charAt(j)){
                    break;
                }else{
                    cnt++;
                }
                if(cnt == M.length()){
                    return i;
                }
            }
        }
        return -1;
    }
}