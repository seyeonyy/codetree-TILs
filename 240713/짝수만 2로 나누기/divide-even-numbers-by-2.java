import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
            if(arr[i] % 2 == 0){
                modify(arr, i);
            }
        }
        for(int i = 0; i < N; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void modify(int[] arr, int cnt){
        arr[cnt] /= 2;
    }
}