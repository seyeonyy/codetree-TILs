import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        if(judge(A)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
    public static boolean judge(String A){
        for(int i = 0; i < A.length(); i++){
            int cnt = 1;
            for(int j = i+1; j < A.length(); j++){
                if(A.charAt(i) != A.charAt(j)){
                    cnt++;
                }
            }
            if(cnt >= 2){
                return true;
            }
        }
        return false;
    }
}