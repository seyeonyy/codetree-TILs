import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        int count = 0;
        for(int i = 0; i < A.length(); i++){
            for(int j = i+1; j <= i+1; j++){
                if(A.charAt(i) == '(' && A.charAt(j) == '('){
                    for(int k = j+1; k < A.length()-1; k++){
                        if(A.charAt(k)== ')' && A.charAt(k+1) == ')'){
                            count++;
                        }
                    }
                }
            }
        }
        System.out.println(count);
    }
}