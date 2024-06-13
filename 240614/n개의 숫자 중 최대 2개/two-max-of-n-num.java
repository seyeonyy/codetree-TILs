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
        int max = arr[0];
        for(int i = 0; i < N ; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        int count = 0;
        for(int i = 0; i < N; i++){
            if(arr[i] != max){
                count++;
            }else{
                break;
            }
        }
        int temp = arr[0];
        arr[0] = max;
        arr[count] = temp;
        int max2 = arr[1];
        for(int i = 1; i < N; i++){
            if(arr[i] > max2){
                max2 = arr[i];
            }
        }
        arr[1] = max2;
        System.out.print(arr[0] + " " + arr[1]);
    }
}