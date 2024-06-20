import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        int lenA = A.length();
        int lenB = B.length();
        int count = 1;
        for(int i = 0; i < lenA; i++){
            if(A.charAt(i) == B.charAt(0)){
                for(int j = 1; j < lenB; j++){
                    if(i+j < lenA && A.charAt(i+j) == B.charAt(j)){
                        count++;
                    }
                }
                if(count == lenB){
                    A = A.substring(0, i) + A.substring(i+lenB);
                    lenA = A.length();
                    i = -1;
                    count = 1;
                }
            }
        }
        System.out.print(A);       
    }
}