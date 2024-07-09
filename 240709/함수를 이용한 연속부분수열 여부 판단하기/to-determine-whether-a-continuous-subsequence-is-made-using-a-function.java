import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
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
        if(A(arrA,arrB) == n2-1){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
    }
    public static int A(int[] A, int[] B){
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
        return count;
    }
}