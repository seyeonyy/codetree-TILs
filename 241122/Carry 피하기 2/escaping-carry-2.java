import java.util.Scanner;
public class Main {
    public static final int INT_MIN = Integer.MIN_VALUE;
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int ans = INT_MIN;
        for(int i = 0; i < n; i++){
            int max = 0;
            for(int j = i+1; j < n; j++){
                for(int k = j+1; k < n; k++){
                    int a = arr[i];
                    int b = arr[j];
                    int c = arr[k];
                    if(a % 10 + b % 10 + c % 10 >= 10){
                        continue;
                    }else{
                        a /= 10;
                        b /= 10;
                        c /= 10;
                        if(a % 10 + b % 10 + c % 10 >= 10){
                            continue;
                        }else{
                            a /= 10;
                            b /= 10;
                            c /= 10;
                            if(a % 10 + b % 10 + c % 10 >= 10){
                                continue;
                            }else{
                                a /= 10;
                                b /= 10;
                                c /= 10;
                                if(a % 10 + b % 10 + c % 10 >= 10){
                                    continue;
                                }else{
                                    max = arr[i] + arr[j] + arr[k];
                                }
                            }
                        }
                    }
                }
                ans = Math.max(ans, max);
            }
        }
        if(ans == INT_MIN){
            System.out.println(-1);
        }else{
            System.out.println(ans);
        }
    }
}