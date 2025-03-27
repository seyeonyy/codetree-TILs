import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        char[] arr = new char[10001];
        for(int i = 0; i < N; i++){
            int a = sc.nextInt();
            arr[a] = sc.next().charAt(0);
        }
        int ans = 0;
        for(int i = 1; i < arr.length-K; i++){
            int cnt = 0;
            for(int j = i; j <= i+K; j++){
                if(arr[j] == 'G'){
                    cnt += 1;
                }
                if(arr[j] == 'H'){
                    cnt += 2;
                }
            }
            ans = Math.max(ans, cnt);
        }
        System.out.println(ans);
    }
}