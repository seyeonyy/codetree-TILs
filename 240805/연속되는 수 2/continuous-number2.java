import java.util.Scanner;
public class Main {
    public static int N;
    public static int[] arr = new int[1001];
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        for(int i = 0; i < N; i++){
            int n = sc.nextInt();
            arr[i] = n;
        }
        int cnt = 1;
        int max = 0;
        if(N == 1){
            max = cnt;
        }else{
            for(int i = 1; i < N; i++){
                if(arr[i] != arr[i-1]){
                    cnt = 1;
                }else{
                    cnt++;
                }
                if(max < cnt){
                    max = cnt;
                }
            }
        }
        System.out.println(max);
    }
}