import java.util.Scanner;
public class Main {
    public static int[] arr = new int[100];
    public static int n;
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        insertionSort();
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void insertionSort(){
        for(int i = 1; i < n; i++){
            int key = arr[i];
            int j = i-1;
            while(j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
}