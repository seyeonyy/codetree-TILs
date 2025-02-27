import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[1000];
        int cnt = 500;
        for(int i = 0; i < N; i++){
            int x = sc.nextInt();
            char c = sc.next().charAt(0);
            if(c == 'R'){
                for(int j = cnt; j <cnt+x; j++){
                    arr[j] += 1;
                }
                cnt += x;
            }else{
                for(int j = cnt-1; j >= cnt-x; j--){
                    arr[j] += 1;
                }
                cnt -= x;
            }
        }
        int count = 0;
        for(int i = 0; i < 1000; i++){
            if(arr[i] >= 2){
                count++;
            }
        }
        System.out.println(count);
    }
}