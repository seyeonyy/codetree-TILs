import java.util.Scanner;
public class Main {
    public static int[] arr = new int[1001];
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int cnt = 0;
        int ans = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] > t){
                cnt++;
            }else{
                cnt = 0;
            }
            ans = Math.max(ans, cnt);
        }
        System.out.print(ans);
    }
}