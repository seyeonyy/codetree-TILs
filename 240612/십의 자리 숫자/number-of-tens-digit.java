import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int[] arr2 = new int[100];

        for(int i = 0; i < 100; i++){
            arr[i] = sc.nextInt();
            if(arr[i] == 0){
                break;
            }
            if(arr[i] >= 10){
                arr2[arr[i] / 10]++;
            }
        }
        for(int i = 1; i <= 9; i++){
            System.out.println(i + " - " + arr2[i]);
        }
    }
}