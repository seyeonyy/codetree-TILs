import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] a = new int[n][2];
        int[][] b = new int[m][2];
        for (int i = 0; i < n; i++) {
            a[i][0] = sc.nextInt();
            a[i][1] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            b[i][0] = sc.nextInt();
            b[i][1] = sc.nextInt();
        }
        // Please write your code here.
        int num = 0;
        int num1 = 0;
        int num2 = 1;
        int[] A = new int[1001];
        int[] B = new int[1001];
        int sum = 0;
        for(int i = 0; i < n; i++){
            num1 += a[i][1];
            for(int j = num; j < num1; j++){
                sum += a[i][0];
                A[j] = sum;

                //System.out.println(j + " " + A[j]);
            }
            num = num1;
        }

        //write B
        int numB = 0;
        int num1B = 0;
        int num2B = 1;
        int sumB = 0;
        for(int i = 0; i < m; i++){
            num1B += b[i][1];
            for(int j = numB; j < num1B; j++){
                sumB += b[i][0];
                B[j] = sumB;
                //System.out.println(j + " " + B[j]);
            }
            numB = num1B;
        }

        int cnt = -2;
        int num3 = -2;
        int cnt1 = 0;
        for(int i = 0; i < A.length; i++){
            if(A[i] > B[i]){
                num3 = 1;
                if(cnt != num3){
                    cnt1++;
                    cnt = num3;
                }
            }else if(A[i] == B[i]){
                num3 = 0;
                if(cnt != num3){
                    cnt1++;
                    cnt = num3;
                }
            }else{
                num3 = -1;
                if(cnt != num3){
                    cnt1++;
                    cnt = num3;
                }
            }
        }
        System.out.println(cnt1-1);
    }
}