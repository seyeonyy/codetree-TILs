import java.util.Scanner;
public class Main {
    public static int[] arr = new int[1001];
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i = 0; i < N; i++){
            int n = sc.nextInt();
            arr[i] = n;
        }
        int cnt = 1;
        int m = 0;
        for(int i = 0; i < N; i++){
            if(i >= 1 && (arr[i] >= 0 && arr[i-1] >= 0) || arr[i] < 0 && arr[i-1] < 0){
                cnt++;
            }else{
                cnt = 1;
            }
            m = Math.max(m, cnt);
        }
        System.out.println(m);
    }
}