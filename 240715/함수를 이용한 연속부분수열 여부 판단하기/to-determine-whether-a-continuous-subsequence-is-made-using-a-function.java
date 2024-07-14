import java.util.Scanner;
public class Main {
    public static int n1;
    public static int n2;
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        int[] arrA = new int[n1];
        int[] arrB = new int[n2];
        int n = 0;
        for(int i = 0; i < n1; i++){
            n = sc.nextInt();
            arrA[i] = n;
        }
        for(int i = 0; i < n2; i++){
            n = sc.nextInt();
            arrB[i] = n;
        }
        if(A(arrA,arrB)){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
    }
    public static boolean A(int[] A, int[] B){
        int count = 0;
        for(int i = 0; i < A.length; i++){
            for(int j = count; j < count+1; j++){
                if(j < B.length){
                    if(B[j] == A[i+count]){
                        count++;
                    }else{
                        count = 0;
                        break;
                    }
                }
            }
        }
        if(count == B.length){
            count -= 1;
        }
        if(count == n2-1){
            return true;
        }
        return false;
    }
}