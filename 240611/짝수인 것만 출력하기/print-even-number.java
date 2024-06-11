import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] arr2 = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            if(arr[i] % 2 == 0){
                arr2[i] = arr[i];
            }
        }
        for(int i = 0; i < arr2.length; i++){
            if(arr2[i] == 0){
                continue;
            }
            System.out.print(arr2[i] + " ");
        }
    }
}