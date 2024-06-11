import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        for(int i = 0; i < 10; i++){
            arr[i] = sc.nextInt();
        }

        int count = 0;
        int sum = 0;
        for(int i = 0; i < 10; i++){
            if(arr[i] == 0){
                break;
            }
            if(arr[i] % 2 == 0){
                count++;
                sum += arr[i];
            }
        }
        System.out.print(count + " " + sum);
    }
}