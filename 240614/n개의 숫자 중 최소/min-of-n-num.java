import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];

        for(int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
        for(int i = 1; i < N; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        int count = 0;
        for(int i = 0; i < N; i++){
            if(min == arr[i]){
                count++;
            }
        }
        System.out.print(min +" " + count);
    }
}