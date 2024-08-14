import java.util.Scanner;
public class Main {
    public static int t;
    public static char d;
    public static final int OFFSET = 1000000;
    public static int[] A = new int[OFFSET+1];
    public static int[] B = new int[OFFSET+1];
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int timeA = 1;
        for(int i = 0; i < n; i++){
            t = sc.nextInt();
            d = sc.next().charAt(0);
            while(t-- > 0){
                if(d == 'L'){
                    A[timeA] = A[timeA-1] - 1;
                }else{
                    A[timeA] = A[timeA-1] + 1;
                }
                timeA++;
            }
        }
        int timeB = 1;
        for(int i = 0; i < m; i++){
            t = sc.nextInt();
            d = sc.next().charAt(0);
            while(t-- > 0){
                if(d == 'L'){
                    B[timeB] = B[timeB-1] -1;
                }else{
                    B[timeB] = B[timeB-1] + 1;
                }
                timeB++;
            }
        }
        int cng1 = 0;
        if(A[1] > A[2]){
            cng1 = 1;
        }else if(A[1] < A[2]){
            cng1 = 2;
        }
        int cng2 = 0;
        if(B[1] > B[2]){
            cng2 = 1;
        }else if(B[1] < B[2]){
            cng2 = 2;
        }
        int max = 0;
        if(timeA > timeB){
            max = timeA;
        }else{
            max = timeB;
        }
        if(max == timeA){
            for(int i = timeB; i < timeA; i++){
                B[i] = B[timeB-1];
            }
        }else{
            for(int i = timeA; i < timeB; i++){
                A[i] = A[timeA-1];
            }
        }
        int count = 0;
        if(max == timeB){
            for(int i = 2; i <= max; i++){
                if(i == max){
                    break;
                }
                if(B[i] > B[i+1]){
                    if(cng2 == 2){
                        if(A[i] == B[i]){
                            count++;
                            cng2 = 1;
                        }
                    }

                }else if(B[i] < B[i+1]){
                    if(cng2 == 1){
                        if(A[i] == B[i]){
                            count++;
                            cng2 = 2;
                        }
                    }
                }
            }
        }
        else{
            for(int i = 2; i <= max; i++){
                if(i == max){
                    break;
                }
                if(A[i] > A[i+1]){
                    if(cng1 == 2){
                        if(A[i] == B[i]){
                            count++;
                            cng1 = 1;
                        }
                    }
                }else if(A[i] < A[i+1]){
                    if(cng1 == 1){
                        if(A[i] == B[i]){
                            count++;
                            cng1 = 2;
                        }
                    }
                }
            }
        }
        System.out.println(count);
    }
}