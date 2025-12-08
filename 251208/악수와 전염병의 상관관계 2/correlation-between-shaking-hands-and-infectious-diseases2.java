import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int P = sc.nextInt();
        int T = sc.nextInt();

        int[] arr1 = new int[N];
        int[] cnt1 = new int[N];
        int[] time = new int[T];
        int[] X = new int[T];
        int[] Y = new int[T];

        int num = 1;
        for(int i = 0; i < N; i++){
            arr1[i] = num;
            num++;
        }

        int t = 0;
        int x = 0;
        int y = 0;
        int n = 0;
        for(int i = 0; i < T; i++){
            t = sc.nextInt();
            x = sc.nextInt();
            y = sc.nextInt();
            time[n] = t;
            X[n] = x;
            Y[n] = y;
            n++;
        }

        for(int i = 0; i < T-1; i++){
            int min = i;
            for(int j = i+1; j < T; j++){
                if(time[j] < time[min]){
                    min = j;
                }
            }
            int tmp = time[i];
            time[i] = time[min];
            time[min] = tmp;
            int tmp2 = X[i];
            X[i] = X[min];
            X[min] = tmp2;
            int tmp3 = Y[i];
            Y[i] = Y[min];
            Y[min] = tmp3;
        }

        for(int i = 0; i < T; i++){
            if(X[i] == P || (cnt1[X[i]-1] >= 1 && cnt1[X[i]-1] < K)){
                if(cnt1[Y[i]-1] < K && cnt1[X[i]-1] < K){
                    cnt1[X[i]-1]++;
                    cnt1[Y[i]-1]++;
                }
            }
            else if(Y[i] == P || (cnt1[Y[i]-1] >= 1 && cnt1[Y[i]-1] < K)){
                if(cnt1[X[i]-1] < K && cnt1[Y[i]-1] < K){
                    cnt1[X[i]-1]++;
                    cnt1[Y[i]-1]++;
                }
            }
        }

        for(int i = 0; i < N; i++){
            if(cnt1[i] >= 1){
                System.out.print(1);
            }else{
                System.out.print(0);
            }
        }
    }
}