import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int idx = 0;

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        double min = Math.pow(2,31)-1;
        for(int i = 0; i < n; i++){
            if(arr[i] < min){
                min = arr[i];
                idx = i;
            }
        }
        int max = 0;
        for(int i = idx+1; i < n; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        if(max != 0){
            int ans = max - (int)min;
            System.out.print(ans);
        }else{
            System.out.print(0);
        }
    }
}