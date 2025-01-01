import java.util.Scanner;
public class Main {
    public static int[] arr = new int[100];
    public static int n;
    public static void selectionSort(){
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                if(arr[i] > arr[j]){
                    int tmp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = tmp;
                }
            }
        }
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        selectionSort();
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}