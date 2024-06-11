import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int count = 0;
        for(int i = 0; i < 100; i++){
            arr[i] = sc.nextInt();
            count++;
            if(arr[i] == 0){
                break;
            }
        }
        int sum = 0;
        for(int i = count-4; i < count; i++){
            sum += arr[i];
        }
        System.out.println(sum);
    }
}