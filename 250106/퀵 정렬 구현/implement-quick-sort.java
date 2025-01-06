import java.util.Scanner;
public class Main {
    public static int MAX_INT = 100000;
    public static int n;
    public static int[] arr = new int[MAX_INT];
    public static int pivot;
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        quickSort(0, n-1);
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static int partition(int low, int high){
        pivot = arr[high];
        int i = low-1;
        for(int j = low; j < high; j++){
            if(arr[j] < pivot){
                i += 1;
                int tmp = arr[j];
                arr[j] = arr[i];
                arr[i] = tmp;
            }
        }
        int tmp = arr[high];
        arr[high] = arr[i+1];
        arr[i+1] = tmp;
        return i+1;
    }
    public static void quickSort(int low, int high){
        if(low < high){
            int pos = partition(low, high);
            quickSort(low, pos-1);
            quickSort(pos+1, high);
        }
    }
}